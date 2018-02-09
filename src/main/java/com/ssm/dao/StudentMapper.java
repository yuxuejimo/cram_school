package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> selectAllStudents();
}