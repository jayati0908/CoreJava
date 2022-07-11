package in.co.rays.myinheritanceandpolymorphism;

public class Rectangle1 extends Shape{
	private int height;
	private int width;
	
	public Rectangle1(int height,int width) {
		this.height = height;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public double area() {
		double area = height*width;
		System.out.println(area);
		return area;
	}

}
