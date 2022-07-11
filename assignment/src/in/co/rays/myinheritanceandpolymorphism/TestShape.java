package in.co.rays.myinheritanceandpolymorphism;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		s.setBorderWidth(6);
		s.setColour("red");
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColour());
	}

}
