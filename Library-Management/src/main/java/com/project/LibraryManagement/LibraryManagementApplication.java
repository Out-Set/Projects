package com.project.LibraryManagement;

import com.project.LibraryManagement.Entity.Book;
import com.project.LibraryManagement.Entity.Student;
import com.project.LibraryManagement.Repository.BookRepo;
import com.project.LibraryManagement.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	@Autowired
	private BookRepo bookRepo;

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public void run(String... args) throws Exception {

		Book b1 = new Book();
		b1.setId(1);
		b1.setBookName("Java");
		b1.setAuthorName("XYZ");

		Book b2 = new Book();
		b2.setId(2);
		b2.setBookName("Python");
		b2.setAuthorName("PQR");

		Book b3 = new Book();
		b3.setId(3);
		b3.setBookName("C++");
		b3.setAuthorName("ABC");

		List<Book> bookList1 = new ArrayList<>();
		bookList1.add(b1);
		bookList1.add(b2);

		List<Book> bookList2 = new ArrayList<>();
		bookList2.add(b2);
		bookList2.add(b3);

		Student s1 = new Student();
		s1.setId(1001);
		s1.setStudentName("Arun");
		s1.setAge(20);
		s1.setAddress("Noida");

		Student s2 = new Student();
		s2.setId(1002);
		s2.setStudentName("Ajay");
		s2.setAge(24);
		s2.setAddress("Delhi");

		List<Student> studentList1 = new ArrayList<>();
		studentList1.add(s1);

		List<Student> studentList2 = new ArrayList<>();
		studentList2.add(s2);

		s1.setBooks(bookList1);
		s2.setBooks(bookList2);

		studentRepo.save(s1);
		studentRepo.save(s2);


		// Accessing Details
		int id = 1002;
		Student s = new Student();
		s = studentRepo.findById(id);

		List<Book> bk = new ArrayList<>();
		bk = s.getBooks();

//		System.out.println(bk);


		for(int i=0; i<bk.size(); i++){
			System.out.print(bk.get(i).getId() + " ");
			System.out.print(bk.get(i).getBookName() + " ");
			System.out.print(bk.get(i).getAuthorName());
			System.out.println();
		}

	}
}
