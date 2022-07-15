package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyingABinaryFile {
		public static void main(String[] args) throws Exception {
			String source = "C:\\Users\\Asus\\Pictures\\Screenshots\\ian.png";
			String target = "C:\\\\Users\\\\Asus\\\\Pictures\\\\Screenshots\\\\copiedian.png";
			FileInputStream f = new FileInputStream(source);
			FileOutputStream fw = new FileOutputStream(target);
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
