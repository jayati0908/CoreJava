package com.rays.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestingWriteSerialization{
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Documents\\jayati123.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		Employee e = new Employee(12345,"jayati","chouhan",123);
		o.writeObject(e);
		System.out.println("please check your file ma'am...");
		o.close();
		
	}

}
