package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testCRUD {
	public static void main(String[] args) throws Exception {
		//testselect();
		testGetId(1);
	}

	

	private static void testselect() {
		
	}

	private static void testGetId(int i) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayatidb","root","jayati@12345");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from student1 where std_id = 1 ");
		while (rs.next()) {
			System.out.print("\t"+rs.getString(1));;
			System.out.print("\t"+rs.getString(2));
			System.out.print("    \t"+rs.getString(3));
			System.out.print("    \t"+rs.getString(4));
			System.out.println(" \t"+rs.getString(5));
		}        
		stmt.close();
		conn.close();
		rs.close();
	}
}
