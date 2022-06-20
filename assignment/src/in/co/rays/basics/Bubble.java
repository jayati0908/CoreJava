package in.co.rays.basics;

public class Bubble {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[i]) {

					temp = a[j];
					//System.out.println("temp = " + temp);

					a[j] = a[i];
					//System.out.println("a[j] = " + a[j] + "  a[i] = " + a[i]);

					a[i] = temp;

					System.out.println(a[i]);

				}

			}

		}
		for (int i = a.length - 1; i >= 0; i--) {

			System.out.println(a[i]);

		}
	}
}
