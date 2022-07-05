package in.co.rays.myinheritanceandpolymorphism;

public class Triangle1 extends Shape{
	private int base;
	private int height;
	
	public Triangle1(int base,int height) {
		this.base = base;
		this.height =height; 
	}
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public double area() {
		double area = 0.5*base*height;
		System.out.println(area);
		return area;
	}

}
