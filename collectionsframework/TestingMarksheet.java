package in.co.rays.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestingMarksheet {
	public static void main(String[] args) {
		Marksheet m1 = new Marksheet();
		m1.setRollno("32341");
		m1.setfName("jayati");
		m1.setlName("chouhan");
		m1.setPhysics(64);
		m1.setMaths(75);
		m1.setChem(70);
		
		Marksheet m2 = new Marksheet();
		m2.setRollno("32340");
		m2.setfName("ashu");
		m2.setlName("singh");
		m2.setPhysics(60);
		m2.setMaths(90);
		m2.setChem(80);
		
	ArrayList<Marksheet> l = new ArrayList<Marksheet>();
	l.add(m1);
	l.add(m2);
	
	Collections.sort(l);
	Iterator<Marksheet> it = l.iterator();
	while (it.hasNext()) {
		Marksheet o = (Marksheet) it.next();
		System.out.println(o.getRollno()+" "+o.getfName()+" "+o.getlName()+" "+o.getPhysics()+" "+o.getChem()+" "+o.getMaths());
	}
	}

}
