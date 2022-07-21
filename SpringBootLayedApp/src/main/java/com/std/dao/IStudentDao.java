package com.std.dao;

import java.util.List;

import com.std.model.Student;

public interface IStudentDao {
	List<Student> getStudentByName(String name1,String name2,String name3);
	String save(Student std);
}
