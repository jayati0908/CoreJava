package in.co.rays.oop;

//import java..Date;
import java.text.ParseException;
//import java.text.SimpleDateFormat;

public class TestMyPerson {
	public static void main(String[] args) throws ParseException {
		MyDate dt = new MyDate();
		Myperson mp = new Myperson();
		mp.setAdr("silicon city");
		System.out.println(mp.getAdr());
		mp.setAge(22);
		System.out.println(mp.getAge());
	    dt.setDate("2000/03/02");
	    System.out.println(dt.getDate());
	}

}
