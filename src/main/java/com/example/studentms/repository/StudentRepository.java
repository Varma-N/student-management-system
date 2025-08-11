package com.example.studentms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentms.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository gives us CRUD methods automatically!
}