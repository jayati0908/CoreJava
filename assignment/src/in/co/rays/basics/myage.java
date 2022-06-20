package in.co.rays.basics;

import java.text.SimpleDateFormat;
//import java.util.Date;

public class myage {
	public static void main(String[] args) {
		String birth="02/03/2000";
		SimpleDateFormat a= new SimpleDateFormat("ww/dd/MM/yyyy");
		String dd =a.format(birth);
		System.out.println(dd);
		
	}

}
