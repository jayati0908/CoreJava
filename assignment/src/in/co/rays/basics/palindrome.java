package in.co.rays.basics;

public class palindrome {
	public static void main(String[] args) {
		int no=121;
		int b,c,d,e;
		b=no%10;
		c=no/10;
		d=c%10;
		e=c/10;
		int pal=b*100+d*10+e;
		if(no==pal)
		{
			System.out.println("number is palindrome");
		}
		
		else
		{
			System.out.println("number is not palindrome");
		}
	}

}
