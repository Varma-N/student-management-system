package com.example.studentms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentms.model.Student;
import com.example.studentms.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepo.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepo.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());

        return studentRepo.save(student);
    }

    public void deleteStudent(Long id) {
        Student student = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        studentRepo.delete(student);
    }
}