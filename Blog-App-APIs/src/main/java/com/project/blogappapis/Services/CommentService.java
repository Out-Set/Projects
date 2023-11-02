package com.project.blogappapis.Services;

import com.project.blogappapis.Payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);
}
