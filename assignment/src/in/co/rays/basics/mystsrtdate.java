package in.co.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class mystsrtdate {
	public static void main(String[] args) throws ParseException {
		Date today=new Date();
		SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		String strDate=format1.format(today);
		System.out.println("form1:"+strDate);
		
	SimpleDateFormat format2= new SimpleDateFormat("MMM/dd/yyyy");
	strDate=format2.format(today);
	System.out.println("form2:"+strDate);
	Date pDate=format1.parse("15/08/1947");
	System.out.println(pDate);
	}
}
