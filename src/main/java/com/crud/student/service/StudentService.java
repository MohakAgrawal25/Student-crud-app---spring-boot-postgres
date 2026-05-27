package com.crud.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.student.entity.Student;
import com.crud.student.exception.StudentNotFoundException;
import com.crud.student.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;

	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudentById(Long id) {
		return studentRepository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
	}

	public void deleteStudent(Long id) {
		Student student = getStudentById(id);
		studentRepository.delete(student);
	}

	public List<Student> getStudentsByBranch(String branch) {
		return studentRepository.findByBranchIgnoreCase(branch);
	}
}
