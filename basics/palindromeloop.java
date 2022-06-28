package in.co.rays.basics;

public class palindromeloop {
	public static void main(String[] args) {
		int no = 120;
		int r;
		int rev = 0;
		int c = no;
		while (no != 0) {
			r = no % 10;
			rev = rev * 10 + r;
			no = no / 10;
		}
		//System.out.println("reversed number is: "+rev);
		if (c == rev) {
			System.out.println("number is palindrome");
		} else {
			System.out.println("number is not palindrome");
		}

	}

}
