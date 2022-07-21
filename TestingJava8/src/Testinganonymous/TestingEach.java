package Testinganonymous;

import java.util.Arrays;

public class TestingEach {
	public static void main(String[] args) {
		int [] a = {4,6,33,464,46,5};
		Arrays.parallelSort(a);
		for(int i: a) {
			System.out.println(i);
		}
	}

}
