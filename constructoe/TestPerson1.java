package in.co.rays.constructoe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson1 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = "02/03/2000";
		Date dt = sdf.parse(s);
		Person1 p1 = new Person1("jayati chouhan", 22);
		Person1 p2 = new Person1(259 , "Silicon City V");
		Person1 p3 = new Person1(dt);
		System.out.println("MY NAME: "+p1.getName());
		System.out.println("MY AGE: "+p1.getAVG_AGE());
		System.out.println("MY ADDRESS: "+p2.getAddress() + p2.getAdr());
		System.out.println("MY DATE OF BIRTH :"+p3.getDob());
		
	}

}