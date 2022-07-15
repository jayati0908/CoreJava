package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CopyconCommand {
	public static void main(String[] args) throws Exception {
		String target = "C:\\Users\\Asus\\OneDrive\\Desktop\\jayatijava\\jayatiiiii.txt";
		FileWriter fw = new FileWriter(target);
		PrintWriter pw = new PrintWriter(fw);
		InputStreamReader  i = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);
		String line = br.readLine();
		while(!line.equals("Stop")) {
			pw.println(line);
			line = br.readLine();
		}
		pw.close();
		i.close();
		System.out.println("PLEASE STOP...!");
	}

}
