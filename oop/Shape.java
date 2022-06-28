package in.co.rays.oop;

public class Shape {
	private String color;
	private int width;
	public String getColor() {
		return color;
	}	
		
			
		
	public void setColor(String color) {
		this.color = color;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Shape(String c, int bw) {
		color = c;
		width = bw;
	}
}
