package in.co.rays.mypackage;

public class Mload {
	
	public int add(int a,int b) {
	
		return a+b;
	}
	public void add(double a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,double c,double d) {
	System.out.println(a+b+c+d);
	}
	public static void main(String[] args) {
		Mload a = new Mload();
		
		a.add(12.00, 19);
		a.add(45,56,131,12);
		a.add(10, 12);
		
		
	}
}
