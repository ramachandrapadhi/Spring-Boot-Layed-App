package com.std.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.std.model.Student;

@Repository("repo")
public class StudentDaoImpl implements IStudentDao {

	private static String GET_BY_NAMES_QUERY = "SELECT * FROM student_db.stdudent where std_name in(?,?,?) order by std_name";
	private static String INSERT_QUERY = "INSERT INTO `student_db`.`stdudent` (`std_id`, `std_name`, `degree`, `stream`, `mark`) VALUES (?,?,?,?,?)";


	@Autowired
	private DataSource dataSource;

	@Override
	public List<Student> getStudentByName(String name1, String name2, String name3) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Student> list = null;
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(GET_BY_NAMES_QUERY);
			ps.setString(1, name1);
			ps.setString(2, name2);
			ps.setString(3, name3);
			rs = ps.executeQuery();
			list = new ArrayList<>();

			while (rs.next()) {
				list.add(new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getDouble(5)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	

	@Override
	public String save(Student std) {
		
		Connection con = null;
		PreparedStatement ps = null;
		String resp = "";
		try {
			con = dataSource.getConnection();
			ps = con.prepareStatement(INSERT_QUERY);
			ps.setString(1, std.getId());
			ps.setString(2, std.getSName());
			ps.setString(3, std.getDegree());
			ps.setString(4, std.getStream());
			ps.setDouble(5, std.getMark());
			int recordInsert = ps.executeUpdate();
			resp = recordInsert + " inserted and ID is : " +std.getId();

		} catch (SQLException e) {
			e.printStackTrace();
			resp = "Some Error occurd while storing";
		}
		return resp;
	}
	
	
}
