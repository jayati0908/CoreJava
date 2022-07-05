package in.co.rays.myinheritanceandpolymorphism;

public class Circle extends Shape{
	private int radius=9;
	public static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		double area = PI*radius*radius;
		System.out.println(area);
		return area;
	}


}
