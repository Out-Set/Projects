package com.project.LibraryManagement.Controller;

import com.project.LibraryManagement.Entity.Book;
import com.project.LibraryManagement.Entity.Student;
import com.project.LibraryManagement.Repository.BookRepo;
import com.project.LibraryManagement.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/home")
    public String welcome(){
        return "Welcome to Library_Management";
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    @GetMapping("/students")
    public List<Student> getAllstudents(){
        return studentRepo.findAll();
    }

    @GetMapping("/students/{id}")
    public List<Object> studentDetails(@PathVariable int id){


        List<Object> al = new ArrayList<>();
        al.add("Student");
        al.add(studentRepo.findById(id));


        Student s = new Student();
        s = studentRepo.findById(id);

        List<Book> bk = new ArrayList<>();
        bk = s.getBooks();

        al.add("Books");

        for(int i=0; i<bk.size(); i++){

            HashMap<String, Object> mpp = new HashMap<>();
            mpp.put("id", bk.get(i).getId());
            mpp.put("bookName", bk.get(i).getBookName());
            mpp.put("authorName", bk.get(i).getAuthorName());

            al.add(mpp);
        }

        return al;
    }

}
