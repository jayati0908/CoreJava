package com.rays.io;

import java.util.Scanner;

public class TestingScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("enter second number");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("the sum of the numbers is: " + c);
		sc.close();
	}

}
