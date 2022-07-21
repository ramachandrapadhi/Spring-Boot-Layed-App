package com.std.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.std.dao.IStudentDao;
import com.std.model.Student;

@Service
public class StudentMngServiceImpl implements IStudentMngService {

	@Autowired
	private IStudentDao repo;
	
	@Override
	public List<Student> getStudentByName(String name1, String name2, String name3) {
		return repo.getStudentByName(name1, name2, name3);
		
	}

	@Override
	public String insert(Student std) {
		
		return repo.save(std);
	}
	

}
