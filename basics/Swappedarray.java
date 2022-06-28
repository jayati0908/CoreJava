package in.co.rays.basics;

public class Swappedarray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {

				if (a[i] < a[j]) {
					a[i] = a[j];
					a[j] = temp;
					temp = a[i];
					System.out.println(a[i]);
				}
				
			}
		}

	}
}
