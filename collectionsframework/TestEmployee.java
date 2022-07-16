package in.co.rays.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("jayati",22,20000);
		Employee e2 = new Employee("anshul",21,100000);
		Employee e3 = new Employee("nikkie",19,40000);
		ArrayList<Employee> l = new ArrayList<Employee>();
		OrderBySal o = new OrderBySal();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		Collections.sort(l, o);
		Iterator<Employee> it = l.iterator();
		while (it.hasNext()) {
			Employee ob = (Employee) it.next();
			System.out.println(ob.getName());
			System.out.println(ob.getAge());
			System.out.println(ob.getSal());
		}
	}

}
