package com.std;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.std.controller.StdController;
import com.std.model.Student;

@SpringBootApplication
public class SpringBootLayeredApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootLayeredApplication.class, args);
		
		StdController std = ctx.getBean("frontOffice", StdController.class);
		
//		std.displayStudentByName("sangram", "ram", "dipak");
		
		std.insertRecord(new Student("hbcjdbj563474840", "Doll", "Arts", "BA", 65.99));
	}

}
