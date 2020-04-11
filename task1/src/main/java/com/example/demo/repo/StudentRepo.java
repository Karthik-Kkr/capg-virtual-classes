package com.example.demo.repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentRepo  {

	Map<Integer,Student>  map = new HashMap<>();
	
	public StudentRepo() {
		
		Student  s1= new Student(583,"Sai Priya",LocalDate.of(2000,1,31));
		Student  s2= new Student(451,"Karthik",LocalDate.of(1999,9,8));
		Student  s3= new Student(583451,"Both",LocalDate.of(2000,1,8));
		map.put(583, s1);
		map.put(451, s2);
		map.put(583451, s3);
	}
	
	public List<Student> findall() {
		Collection<Student> values = map.values();
		List<Student>   list = new ArrayList<>(values);
		return list;
	}

	public Student findStudentByName(String studentName)
	{
		return map.get(studentName);
	}
	
	public  Student deleteStudentByName(String studentName)
	{
		return  map.remove(studentName);
	}
	
	public Student  addStudent(Student student)
	{
		map.put(student.getStudentId(), student);
		
		return student ;
	}
}
