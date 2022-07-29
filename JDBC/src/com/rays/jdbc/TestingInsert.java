package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestingInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//	testSelect();
	//	testAdd();
	//	testDelete();
	//	testUpdate();
		testGetId();
		{
			
		}
	}

//	private static void testGetId(int i) {
//		// TODO Auto-generated method stub
//		
//	}

	private static void testUpdate() {
		// TODO Auto-generated method stub
		
	}

	private static void testDelete() {
		// TODO Auto-generated method stub
		
	}

	private static void testAdd() {
		
	}

	private static void testSelect() {
		
	}

	private static void testGetId() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayatidb","root","jayati@12345");
		Statement stmt = conn.createStatement();
		int e = stmt.executeUpdate("select * from student1 where std_id=1");
		System.out.println(e+ "congrats...!");
		stmt.close();
		conn.close();
	}
//Delete from student1 where std_id =12
}
