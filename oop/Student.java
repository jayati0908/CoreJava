package in.co.rays.oop;

import java.util.Date;

public class Student {
	private String name;
	private int id;
	private Date dob;
	private int age;
	private String address;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {                   
	 	return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setDob(Date string) {
		this.dob = string;
	}
	public Date getDob() {
		return dob;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
}
	
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
////import java.util.Date;
//
////
//	public static void main(String[] args) throws ParseException {
//	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	String s = "02/03/2000";
//	Date d = sdf.parse(s);
//		Student std = new Student();
//		std.setName("Jayati Chouhan");
//		System.out.println(std.getName());
//		std.setId(12345);
//		System.out.println(std.getId());
//		std.setAdress("V-259");
//		System.out.println(std.getAddress());
//		std.setAge(22);
//		System.out.println(std.getAge());
//		std.setDob(d);
//		System.out.println(std.getDob());
//		}
//
//
//
