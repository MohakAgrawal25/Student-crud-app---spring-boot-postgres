package com.crud.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByBranchIgnoreCase(String branch);
}
