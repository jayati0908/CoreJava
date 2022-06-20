package in.co.rays.basics;

public class Reverse1 {
	public static void main(String[] args) {
		int no=128;
		int x=no;
		int b,c,d,e;
		b=no%10;
		c=no/10;
		d=c%10;
		e=c/10;
		int rev=b*100+d*10+e;
  System.out.println(rev);
		
		if(x==rev) {
			System.out.println("no is palindrome");
			
		}
	}

}
