package Testing;

public class Pal1 {
	public static void main(String[] args) {
		int no=181;
		int r;
		int rev=0;
		int a=no;
		while(a!=0) {
			r=a%10;
			rev= rev * 10+ r;
			r= a/10;
		}
		if(a==rev) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");
		}
	}

}
