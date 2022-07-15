package com.rays.io;

import java.io.FileReader;

public class TestFiles2 {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		FileReader f = new FileReader("C:\\Users\\Asus\\OneDrive\\Desktop\\command.txt");
		int c = f.read();
		char ch;
		while(c!=-1) {
			ch = (char)c;
			System.out.print(ch);
			c = f.read();
		}
	}

}
