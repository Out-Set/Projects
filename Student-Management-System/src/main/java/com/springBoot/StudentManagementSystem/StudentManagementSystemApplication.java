package com.springBoot.StudentManagementSystem;

import com.springBoot.StudentManagementSystem.Entity.Student;
import com.springBoot.StudentManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

		studentRepository.save(new Student("Rohit", "Singh","rohit@gmail.com"));
	}
}
