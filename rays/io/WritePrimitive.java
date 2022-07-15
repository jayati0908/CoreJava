package com.rays.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WritePrimitive {
	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\command.dat");
		DataOutputStream dt = new DataOutputStream(f);
		dt.writeInt(1);
		dt.writeBoolean(false);
		dt.writeChar('p');
		dt.writeDouble(23.5);
		f.close();
		dt.close();
		System.out.println("your data is written successfully");
	}

}
