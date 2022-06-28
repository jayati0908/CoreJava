package in.co.rays.basics;

public class Assignment {
	public static void main(String[] args) {

		int percent = 55;
		if (percent > 90) {
			System.out.println("your grade is A+");
		} else if (percent <= 90 && percent >= 80) {
			System.out.println("your grade is A");
		} else if (percent <= 80 && percent >= 70) {
			System.out.println("your grade is B+");
		} else if (percent <= 70 && percent >= 60) {
			System.out.println("your grade is B");
		} else if (percent <= 60 && percent >= 50) {
			System.out.println("your grade is C");
		} else {
			System.out.println("you are fail");
		}
		for(int i=0;i<=5;i++){
		System.out.println(Math.random()*100);
	}
		}
}
