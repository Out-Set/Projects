package com.project.blogappapis.Repository;

import com.project.blogappapis.Entity.Category;
import com.project.blogappapis.Entity.Post;
import com.project.blogappapis.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);

}
