package in.co.rays.myinheritanceandpolymorphism;

public class Triangle extends Shape{
	private double base=33;
	private double height=44;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		 double area = 0.5*base*height;
		System.out.println(area);
		return area;
	}
	

}
