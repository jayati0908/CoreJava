package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingFile {
	public static void main(String[] args) throws Exception {
		FileReader f = new FileReader("C:\\Users\\Asus\\OneDrive\\Desktop\\mine.txt");
		BufferedReader br = new BufferedReader(f);
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}f.close();
	}

}
