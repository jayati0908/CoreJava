package in.co.rays.basics;

public class Sumfif {
	public static void main(String[] args) {

		int x = 0;
		float y = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				x = x + i;

			} else {
				y = y + i;

			}
		}
		System.out.println("the average of all even numbers is:" + (x / 2));
		System.out.print("the average of all odd numbers is:" + (y / 2));
	}
}
