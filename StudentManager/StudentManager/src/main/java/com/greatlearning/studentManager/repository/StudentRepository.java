package com.greatlearning.studentManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.studentManager.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}