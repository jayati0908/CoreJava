package in.co.rays.myinheritanceandpolymorphism;

public class ExRectangle extends Shape {
	public static void main(String[] args) {

	Rectangle rec = new Rectangle();
	rec.setLength(3);
	rec.setWidth(5);
	System.out.println(rec.getLength());
	System.out.println(rec.getWidth());
	rec.area();
		
	}
}

