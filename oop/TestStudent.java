package in.co.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStudent {
	public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String s = "02/03/2000";
	Date d = sdf.parse(s);
		Student std = new Student();
		std.setName("Name = Jayati Chouhan");
		System.out.println(std.getName());
		std.setId(12345);
		System.out.println(std.getId());
		std.setAdress("V-259");
		System.out.println(std.getAddress());
		std.setAge(22);
		System.out.println(std.getAge());
		std.setDob(d);
		System.out.println(std.getDob());
		}

}
