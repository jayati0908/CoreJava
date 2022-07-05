package in.co.rays.assignmentninepointseven;

public class Circle extends Shape {

	private int radius;
	public static final double PI = 3.14;

	public double area() {
		double area = PI * radius * radius;
		return area;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

}
