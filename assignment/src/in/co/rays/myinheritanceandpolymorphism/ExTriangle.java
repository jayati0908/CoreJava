package in.co.rays.myinheritanceandpolymorphism;

public class ExTriangle extends Shape{
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.setHeight(30);
		tri.setBase(12);
		System.out.println(tri.getBase());
		System.out.println(tri.getHeight());
		tri.area();
	}
	

}
