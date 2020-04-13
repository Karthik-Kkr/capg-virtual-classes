package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo  studentRepo;
	
	public Student   findStudentByName(String studentName)
	{
		return  studentRepo.findStudentByName(studentName);
	}
	
	public List<Student> findall() {
		return studentRepo.findall();
	}

	public Student  addStudent(Student student)
	{
		return studentRepo.addStudent(student);
	}
	
	public Student deleteStudentByName(String studentName) {
		return studentRepo.deleteStudentByName(studentName);
	}
}
