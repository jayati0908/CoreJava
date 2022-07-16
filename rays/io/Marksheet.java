package com.rays.io;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Marksheet implements Externalizable {
	private String fName = "jayati";
	private int phy = 69;
	private int chem = 68;
	private int maths = 47;
	private transient int pwd = 3475;

	@Override
	public void writeExternal(ObjectOutput o) throws IOException {
		o.writeObject(fName);
		o.writeInt(phy);
		o.writeInt(chem);
		o.writeInt(pwd);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		fName = (String) in.readObject();
		phy = in.readInt();
		chem = in.readInt();
		pwd = in.readInt();
	}

	public static void main(String[] args) throws Exception {
		FileOutputStream f = new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\file.txt");
		ObjectOutputStream ob = new ObjectOutputStream(f);
		Marksheet m = new Marksheet();
		ob.writeObject(m);
		System.out.println("my serialization");

		FileInputStream f1 = new FileInputStream("C:\\Users\\Asus\\OneDrive\\Desktop\\file.txt");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		Marksheet m1 = (Marksheet) o1.readObject();
		System.out.println(m1.fName);
		System.out.println(m1.phy);
		System.out.println(m1.chem);
		System.out.println(m1.maths);
		System.out.println(m1.pwd);
		System.out.println("success");
		ob.close();
		o1.close();
	}
}
