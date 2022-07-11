package in.co.rays.collectionsframework;

import java.util.ArrayList;

public class Testingtoo {
	public static void main(String[] args) {
		ArrayList v = new ArrayList();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("five");
		int size = v.size();
		for(int i=0;i<size;i++) {
			System.out.println(i+" : "+v.get(i));
		}
	}

}
