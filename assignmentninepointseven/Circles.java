package in.co.rays.assignmentninepointseven;

public class Circles extends Shapes {
	private int radius;
	//private static int size = 12;

	public int getRadius() {
		return radius;
	}
	public static void Size() {
		int c = 100;
		System.out.println(100);
	}
	

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	public static void main(String[] args) {
		Shapes s = new Shapes();
		Shapes s1 = new Circles(); 
		s.setBorder(120);
		System.out.println(s.getBorder());
		s.setColour("blue");
		System.out.println(	s.getColour());

		Circles c = new Circles();
		c.setRadius(30);
		c.Size();
		System.out.println(c.getRadius());
	}
	
}
