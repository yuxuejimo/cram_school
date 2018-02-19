package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Student;

public interface IStudentService {
	public Student getStudentById(int stu_id);
	
	public List<Student> getAllStudent();
	
	public void insertStudent(Student s);
}
