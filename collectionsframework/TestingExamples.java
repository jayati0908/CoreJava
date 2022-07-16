package in.co.rays.collectionsframework;

import java.util.ArrayList;

public class TestingExamples {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		Integer i = new Integer(4);
		al.add(i);
		System.out.println(i);
		Integer value = (Integer)al.get(3);
		System.out.println(value);
	}

}
