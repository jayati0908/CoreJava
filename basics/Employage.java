package in.co.rays.basics;

import java.time.LocalDate;
import java.time.Period;

public class Employage {
	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		LocalDate birthday=LocalDate.of(2000, 3, 2);
		
		Period different= Period.between(birthday, today) ;
		System.out.println("year= "+different.getYears());
		System.out.println("month= "+different.getMonths());
		System.out.println("days= "+different.getDays());
	}

}
