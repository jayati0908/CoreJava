package com.rays.io;

import java.io.File;
import java.util.Date;

public class TestingFiles {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Asus\\OneDrive\\Desktop\\command.txt");
		//System.out.println(f.exists());
		if(f.exists()) {
			
			System.out.println("1 : "+f.getName());
			System.out.println("2 : "+f.getAbsolutePath());
			System.out.println("3 : "+f.getPath());
			System.out.println("4 : "+f.canRead());
			System.out.println("5 : "+f.canExecute());
			System.out.println("6 : "+f.exists());
			System.out.println("7 : "+f.isDirectory());
			System.out.println("8 : "+f.isFile());
			System.out.println("9 : "+f.length());
			System.out.println(f.lastModified());
			System.out.println("last modified: "+new Date(f.lastModified()));
		}else {
			System.out.println("please check your name");
		}
	}

}
