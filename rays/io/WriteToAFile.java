package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteToAFile {
	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("C:\\Users\\Asus\\OneDrive\\Desktop\\mine.txt",true);
		PrintWriter pw = new PrintWriter(f);
//		for(int i=0;i<5;i++) {
//			pw.println(i);
		pw.println("jayati1");
		pw.println("jayati2");
		pw.println("jayati3");
		pw.println("jayati4");
		pw.println("jayati5");
		pw.println("chouhan");
		pw.close();
		f.close();
		System.out.println("done");
	}

}
