package com.rays.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ReadingPrimitive {
	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\command.dat");
		DataInputStream dt = new DataInputStream(f);
		System.out.println(dt.readInt());
		System.out.println(dt.readBoolean());
		System.out.println(dt.readChar());
		System.out.println(dt.readDouble());
		dt.close();
		f.close();
	}

}
