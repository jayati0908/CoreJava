package in.co.rays.mypackage;

public class Circle2 extends Shape{
	private int radius;
	public static final double PI = 3.14;
	
	public Circle2(int r) {
		radius = r;
	}
	public double area() {
		double area = PI*radius*radius;
		return area;
	}
		
}
