package com.springBoot.StudentManagementSystem.Service;

import com.springBoot.StudentManagementSystem.Entity.Student;
import com.springBoot.StudentManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(int id){
        return studentRepository.findById(id).get();
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

}
