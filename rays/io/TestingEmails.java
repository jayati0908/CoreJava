package com.rays.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestingEmails {
	public static void main(String[] args) throws Exception {
		FileReader source = new FileReader("C:\\Users\\Asus\\OneDrive\\Desktop\\emails.txt");
		FileWriter target = new FileWriter("C:\\Users\\Asus\\OneDrive\\Desktop\\emails123.txt");
		PrintWriter pw = new PrintWriter(target);
		Scanner sc = new Scanner(source);
		String regex = "^([\\w\\-\\.]+)@((\\[([0-9]{1,3}\\.){3}[0-9]{1,3}\\])|(([\\w\\-]+\\.)+)([a-zA-Z]{2,4}))$";
		while (sc.hasNextLine()) {
			String s = (String) sc.nextLine();
			if (s.matches(regex)) {
				System.out.println(s);
				pw.println(s);
			}
		}
		source.close();
		target.close();
		pw.close();
		sc.close();
		System.out.println("your emails are sorted successfully");
	}

}
