package in.co.rays.myinheritanceandpolymorphism;

public class TestingAlll {
	public static void main(String[] args) {
		double t = 0.0;
		Shape[] s = new Shape[3];
		s[0] = new Rectangle1(8, 6);
		s[1] = new Circle1(2);
		s[2] = new Triangle1(12, 10);
		for (int i = 0; i < s.length; i++) {
			t+= s[i].area();
		}
		System.out.println(t);

	}

}
