package in.co.rays.assignmentninepointseven;

public class Checking {
	public static void main(String[] args) {
		double t = 0.0;

		Shape[] s = new Shape[2];
		s[0] = new Circle();
		s[1] = new Rectangle();

		Circle c = (Circle) s[0];
		c.setRadius(2);

		Rectangle r = (Rectangle) s[1];
		r.setLength(12);
		r.setBreadth(15);

		for (int i = 0; i < s.length; i++) {

			t = t + s[i].area();

		}
		System.out.println(t);
	}

}
