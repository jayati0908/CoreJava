package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadingSerialization {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("C:\\Users\\Asus\\OneDrive\\Documents\\jayati123.txt");
		ObjectInputStream ob = new ObjectInputStream(f);
		Employee e = (Employee)ob.readObject();
		System.out.println(e.getfName());
		System.out.println(e.getlName());
		System.out.println(e.getId());
		System.out.println(e.getPwd());
	
	}

}
