package com.project.LibraryManagement.Repository;

import com.project.LibraryManagement.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    public Student findById(int id);
}
