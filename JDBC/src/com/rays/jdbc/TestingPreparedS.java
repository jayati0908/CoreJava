package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestingPreparedS {
	public static void main(String[] args) throws Exception {
//		testAdd();
		testSelect();{
			
		}
	}

		private static void testAdd() {
		// TODO Auto-generated method stub
		
	}

		private static void testSelect() throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jayatidb","root","jayati@12345");
     		int std_id = 1;
//			String fname = "nachiket";
//			String lname = "kumar";
//			int sem = 4;
//			int dep_id = 5;
			PreparedStatement ps = conn.prepareStatement("select * from student1 where std_id =?");
			ps.setInt(1, std_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print("\t"+rs.getString(1));;
				System.out.print("\t"+rs.getString(2));
				System.out.print(" \t "+rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
			}        
			
//			ps.setString(2, fname);
//			ps.setString(3, lname);
//			ps.setInt(4, dep_id);
//			ps.setInt(5, sem);
			ps.execute();
			conn.close();
			ps.close();
			System.out.println("done");
	}
//INSERT into student1 values(?,?,?,?,?)
}
