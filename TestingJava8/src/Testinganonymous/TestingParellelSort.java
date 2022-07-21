package Testinganonymous;

import java.util.Arrays;

public class TestingParellelSort {
	public static void main(String[] args) {
		int[] a = { 1, 5, 4, 6, 32, 6, 8 };
		Arrays.parallelSort(a);

		for (int i : a) {

			System.out.print(" ,"+i);

		}
	}

}
