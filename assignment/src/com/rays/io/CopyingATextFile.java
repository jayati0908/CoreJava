package com.rays.io;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyingATextFile {
	public static void main(String[] args) throws Exception {
		String source = "C:/Users/Asus/OneDrive/Desktop/mine.txt";
		String target = "C:\\Users\\Asus\\OneDrive\\Desktop\\command.txt";
		FileReader f = new FileReader(source);
		FileWriter fw = new FileWriter(target);
		int ch = f.read();
		while (ch!=-1) {
			fw.write(ch);
			ch = f.read();
		}
		fw.close();
		f.close();
		System.out.println(source +"_____is copied to______"+target);
	}

}
