package com.rays.io;

import java.io.File;

public class TestFiles1 {
	public static void main(String[] args) {
//		File directory = new File("C:\\Users\\Asus\\OneDrive");
//		String [] list = directory.list();
//		for(int i=0;i<list.length;i++) {
//			System.out.println(i+1+" : "+list[i]);

		File directory = new File("C:\\Users\\Asus\\OneDrive");
		String[] list = directory.list();
		for (int i = 0; i < list.length; i++) {
			File f = new File(directory, list[i]);
			if (!f.isFile()) {
				System.out.println(i + 1 + " : " + list[i]);
			}

			
		}

	}
}
