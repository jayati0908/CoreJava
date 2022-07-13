package com.rays.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFiles2 {
	public static void main(String[] args) throws Exception {
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
