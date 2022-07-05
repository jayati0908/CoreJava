package in.co.rays.myinheritanceandpolymorphism;

public class ExCircle extends Shape {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(2);
		c.setBorderWidth(65);
		System.out.println(c.getBorderWidth());
		c.getColour();
		c.area();
		System.out.println(c.getRadius());
	}

}
