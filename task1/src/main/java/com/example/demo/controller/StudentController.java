package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService  studentService ;
	
	 @GetMapping("/student")
	public  List<Student>  getAllStudents()
	{
		  return studentService.findall();
	}
	 
	@GetMapping("/student/{name}") 
	public Student  findStudentsByName(@PathVariable("name") String studentName)
	{
		  return studentService.findStudentByName(studentName);
	}
	
	@PostMapping("/student") 
	public Student  addStudentByName(@RequestBody Student  student)
	{
		  return studentService.addStudent(student);
	}
	
	@DeleteMapping("/student/{name}") 
	public Student  deleteStudentByName(@PathVariable("name") String studentName)
	{
		  return studentService.deleteStudentByName(studentName);
	}
	

}
