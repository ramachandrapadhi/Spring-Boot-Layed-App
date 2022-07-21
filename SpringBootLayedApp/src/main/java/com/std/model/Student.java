package com.std.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	private String id;
	
	private String sName;
	
	private String stream;
	
	private String Degree;
	
	private Double mark;

}
