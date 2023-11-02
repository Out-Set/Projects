package com.project.blogappapis.Controller;

import com.project.blogappapis.Payloads.ApiResponse;
import com.project.blogappapis.Payloads.CommentDto;
import com.project.blogappapis.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentService commentService;

    // Create comment
    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId) {
        CommentDto createComment = this.commentService.createComment(commentDto, postId);
        return new ResponseEntity<CommentDto>(createComment, HttpStatus.CREATED);
    }

    // Delete comment
    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId) {

        this.commentService.deleteComment(commentId);

        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment Deleted successfully !!", true), HttpStatus.OK);
    }
}
