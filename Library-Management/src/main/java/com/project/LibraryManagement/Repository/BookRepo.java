package com.project.LibraryManagement.Repository;

import com.project.LibraryManagement.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

    public Book findById(int id);


}
