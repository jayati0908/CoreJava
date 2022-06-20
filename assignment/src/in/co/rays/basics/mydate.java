package in.co.rays.basics;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class mydate {
	public static void main(String[] args) throws ParseException {
		Date d= new Date();
		System.out.println(d);
		SimpleDateFormat a=new SimpleDateFormat("ww/dd/MMMM/yy");
		String dd  =a.format(d);
		System.out.println((dd));
		String dt="15/06/2022";
		Date nd=a.parse(dd);
		System.out.println(nd);
	}
	

}
