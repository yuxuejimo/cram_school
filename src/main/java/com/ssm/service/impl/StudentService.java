package com.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.StudentMapper;
import com.ssm.pojo.Student;
import com.ssm.service.IStudentService;

@Service("studentService")
public class StudentService implements IStudentService{
	
	@Resource
	private StudentMapper studentMapper;
	
	public Student getStudentById(int stu_id) {
		return studentMapper.selectByPrimaryKey(stu_id);
	}

	
	public List<Student> getAllStudent() {
		return studentMapper.selectAllStudents();
	}


	@Override
	public void insertStudent(Student s) {
		// TODO Auto-generated method stub
		studentMapper.insert(s);
	}

}
