package in.co.rays.assignmentninepointseven;

public class Soltnsix {
	public int add(int a,int b) {
		return a+b;
	}
	public int mult(int a,int b,int c) {
		return a*b*c;
	}
	public double minus(double a,double b) {
		return a-b;
	}
	public static void main(String[] args) {
		Soltnsix six = new Soltnsix();
		System.out.println(six.add(10, 18));
		System.out.println(six.mult(12, 30, 10));
		System.out.println(six.minus(12, 90));
	}
}
