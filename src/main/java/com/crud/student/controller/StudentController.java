package com.crud.student.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.student.entity.Student;
import com.crud.student.service.StudentService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;

	@PostMapping
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student) {
		return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(student));
	}

	@GetMapping
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return studentService.getStudentById(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/branch/{branch}")
	public List<Student> getStudentsByBranch(@PathVariable String branch) {
		return studentService.getStudentsByBranch(branch);
	}
}
