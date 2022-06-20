package in.co.rays.basics;

public class withoutlooppal {
	public static void main(String[] args) {
		int no = 121;
		int r;
		int rev = 0;
		int a = no;
		while (no != 0) {
			r = no % 10;
			rev = (rev * 10) + r;
			r = no / 10;
			if (a == rev) {
				System.out.println("palindrome");
			} 
			else {
				System.out.println("not");
			}

		}
	}

}
