package in.co.rays.myinheritanceandpolymorphism;

public class Circle1 extends Shape{
	private int radius;
	public static final double PI = 3.14;
	
	public Circle1(int radius) {
		this.radius = radius;
	}
	public double area() {
		double area = PI*radius*radius;
		System.out.println(area);
		return area;
	}

}
