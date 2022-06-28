package in.co.rays.basics;

import java.time.LocalDate;
        
public class testDate {
	public static void main(String[] args) {
		LocalDate enddt=LocalDate.of(2000, 3, 2);
		LocalDate today=LocalDate.now();
		if(enddt.isAfter(today)) {
			System.out.println("your date is correct");
		}else if(enddt.isBefore(today)){
			System.out.println("your date has an error");
		}
	}

	

}