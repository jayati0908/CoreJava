package in.co.rays.assignmentninepointseven;

public class Rectangle extends Shape{

	private int length;
	private int breadth;
	public double area() {
		double area = length*breadth;
		return area;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
