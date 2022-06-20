package in.co.rays.basics;

public class armstrong {
	public static void main(String[] args) {
		int no = 151;
		int r;
		int s = 0;
		int c = no;
		while (c != 0) {
			r = c % 10;
			c = c / 10;
			s = s + (r * r * r);

		}
		if (s == no) {
			System.out.println("the number is armstrong");
		} else {
			System.out.println("the number is not an armstrong");
		}

	}
}