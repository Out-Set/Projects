package com.project.blogappapis.Services;

import com.project.blogappapis.Entity.Post;
import com.project.blogappapis.Payloads.PostDto;
import com.project.blogappapis.Payloads.PostResponse;

import java.util.List;

public interface PostService {

    // Create
    PostDto createPost(PostDto  postDto, Integer userId, Integer categoryId);

    // Update
    PostDto updatePost(PostDto postDto, Integer postId);

    // Delete
    void deletePost(Integer postId);

    // Get all post
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    // Get single post
    PostDto getPostById(Integer postId);

    // Get all post by Category
    List<PostDto> getPostsByCategory(Integer categoryId);

    // Get all Posts by User
    List<PostDto> getPostsByUser(Integer userId);

    // Search posts
    List<PostDto> searchPosts(String keyword);
}
