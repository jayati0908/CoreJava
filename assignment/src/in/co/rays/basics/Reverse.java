package in.co.rays.basics;

public class Reverse {
	public static void main(String[] args) {
		int a=153;
		int b,c,d,e;
		b=a%10;
		c=a/10;
		d=c%10;
		e=c/10;
		int arm=e*e*e+d*d*d+b*b*b;
		if(a==arm)
		{
			System.out.println("the number is armstrong");
		}
		else
		{
			System.out.println("the number is not armstrong");
		}
	}

}
