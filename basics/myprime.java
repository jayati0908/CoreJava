package in.co.rays.basics;

public class myprime {
	public static void main(String[] args) {
		int x = 0;
		int no = 35;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				x++;
			}
		}
		if (x > 0) {
			System.out.println("not prime");
		} else {
			System.out.println("the number is prime");
		}
	}
}