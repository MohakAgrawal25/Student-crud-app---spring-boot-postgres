package com.crud.student.exception;

public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String message) {
		super(message);
	}
}
