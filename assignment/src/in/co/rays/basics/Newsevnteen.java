package in.co.rays.basics;

public class Newsevnteen {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 7, 7, 9, 5, 11116 };
		int[] b = { 1, 2, 3, 4, 5, 6, 8 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					break;
				} else if (j == (b.length - 1)) {
					System.out.println("missing elements are:" + a[i]);
				}
			}
		}
	}
}
