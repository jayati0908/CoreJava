package in.co.rays.basics;

public class Mysolsevteen {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 1, 2, 3, 4, 5, 6 };
		int k = 0;
		int x = 0;
		int miss = 0;
		for (int i : a) {
			k =k+ i;
		}
		for (int j : b) {
			x += j;
		}
		miss = k - x;
		System.out.println("your missing element is:" + miss);
	}
}
