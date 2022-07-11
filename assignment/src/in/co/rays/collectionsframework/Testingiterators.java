package in.co.rays.collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Testingiterators {
	public static void main(String[] args) {
		
		String s = "three";
		ArrayList a = new ArrayList();
		a.add("one");
		a.add("two");
		a.add("three");
		a.add("four");
		a.add("five");
		
		Iterator it = a.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			it.remove();
//			 if (s.equals("three")) {
//		            it.remove();
//		            System.out.println("\nThe element Orange is removed");
//		            break;
//		         }

		}

		System.out.println(a);

	}

}
