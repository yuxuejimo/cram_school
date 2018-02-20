package com.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.Student;
import com.ssm.service.IStudentService;

@Controller
@RequestMapping("/stu")
public class StudentController {
	
	@Resource
	private IStudentService stuService;
	
	@RequestMapping("/showStudent")
	public String showStudent(HttpServletRequest request, Model model){
		int stu_id = Integer.parseInt(request.getParameter("stuid"));
		Student s = stuService.getStudentById(stu_id);
		model.addAttribute("student", s);
		return "Student";
	}
	
	@ResponseBody
	@RequestMapping("/showAllStudent")
	public List<Student> showAllStudent(){
		return stuService.getAllStudent();
	} 
	
	
	@RequestMapping("/addStudent")
	public String addStudent(@RequestBody Student s){
		
		stuService.insertStudent(s);
		return "student";
		
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s){
		stuService.updateStudent(s);
		return "student";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("stuids[]") Integer[] ids){
		stuService.deleteStudent(ids);
		return "student";
	}
}
