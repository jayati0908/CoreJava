
package in.co.rays.collectionsframework;

import java.util.Enumeration;
import java.util.Vector;

public class TestingEmun {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		Enumeration e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
