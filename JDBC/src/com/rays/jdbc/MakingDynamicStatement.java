package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MakingDynamicStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//testSelect();
		testAdd();
		testDelete();
		testUpdate();
		{
			
		}
	}

	private static void testDelete() {
		// TODO Auto-generated method stub
		
	}

	private static void testAdd() {
		// TODO Auto-generated method stub
		
	}

	private static void testSelect() {
		
	}

	private static void testUpdate() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayatidb","root","jayati@12345");
		Statement stmt = conn.createStatement();
		int std_id = 13;
		String fname = "vishal";
		String lname = "mishra";
		int sem = 4;
		int dep_id = 5;
		int i = stmt.executeUpdate("UPDATE student1 set fname='vaibhav' where std_id=15");
		System.out.println(i+" "+"Updated...");
		conn.close();
		stmt.close();
	}
//"INSERT into student1 values("+std_id+",'"+fname+"','"+lname+"',"+sem+",+"+dep_id+")"
	//Delete from student1 where std_id=13
}
