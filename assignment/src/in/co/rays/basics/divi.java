package in.co.rays.basics;

public class divi {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=add(a,b);
		System.out.println(c);
}
	public static int add(int a,int b) {
		
		int c=a+b;
		return c;
	}
}