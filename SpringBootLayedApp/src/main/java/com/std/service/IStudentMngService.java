package com.std.service;

import java.util.List;

import com.std.model.Student;

public interface IStudentMngService {
	public List<Student> getStudentByName(String name1,String name2,String name3);
	public String insert(Student std);

}
