package com.rays.io;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String fName;
	private String lName;
	private transient int pwd;
	public Employee(){}
	public Employee(int id, String fn, String ln, int pwd) {
	
		this.id = id;
		fName = fn;
		lName = ln;
		this.pwd = pwd;
	}
	public int getId() {
		return id;
	}
	public String getfName() {
		return fName;
	}
	public String getlName() {
		return lName;
	}
	public int getPwd() {
		return pwd;
	}
	

}
