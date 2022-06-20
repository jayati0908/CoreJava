package in.co.rays.basics;

public class Mysort {
	public static void main(String[] args) {
		int[] a = { 5, 8, 1, 3, 6 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {

					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
         
		}
		System.out.println("=======Bubble Sort Start=======");
		for (int i = a.length - 1; i >= 0; i--) {

			System.out.println(a[i]);

		}
		System.out.println("===============================");
		System.out.println("Largest Number = " + a[a.length - 1]);
		System.out.println("Second Largest Number = " + a[a.length - 2]);

	}
}
