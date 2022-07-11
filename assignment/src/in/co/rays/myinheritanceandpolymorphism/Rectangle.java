package in.co.rays.myinheritanceandpolymorphism;

public class Rectangle extends Shape {
	private int length=12;
	private int width=10;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public double area() {
		int area = length*width;
		System.out.println(area);
		return area;
	}

}
