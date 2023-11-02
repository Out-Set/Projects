package com.project.blogappapis.Services.Impl;

import com.project.blogappapis.Entity.Comment;
import com.project.blogappapis.Entity.Post;
import com.project.blogappapis.Exceptions.ResourceNotFoundException;
import com.project.blogappapis.Payloads.CommentDto;
import com.project.blogappapis.Repository.CommentRepo;
import com.project.blogappapis.Repository.PostRepo;
import com.project.blogappapis.Services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {

        Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", "post id", postId));
        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);

        Comment savedComment = this.commentRepo.save(comment);

        return this.modelMapper.map(savedComment,CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment comment = this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", "comment id", commentId));
        this.commentRepo.delete(comment);
    }
}
