package com.std.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.std.model.Student;
import com.std.service.IStudentMngService;

@Controller("frontOffice")
public class StdController {
	
	@Autowired
	private IStudentMngService service;
	
	
	public void displayStudentByName(String name1,String name2,String name3) {
		
		List<Student> list =service.getStudentByName(name1, name2, name3);
		
		list.forEach(i-> System.out.println(i));
		
	}
	
	public void insertRecord(Student std) {
		String resp =service.insert(std);
		System.out.println(resp);
	}

}
