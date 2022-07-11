package in.co.rays.collectionsframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestingSets {
	public static void main(String[] args) {
//		Set st = new HashSet<>();
//		st.add(12);
//		st.add(15);
//		st.add(20);
//		st.add(25);
//		st.add(84);
//	//	System.out.println(st);//gives random order...
//		Set s = new LinkedHashSet();
//		s.add(10);
//		s.add(50);
//		s.add(13);
//		s.add(56);
//		s.add(34);
//		System.out.println(s);//maintains insertion order...
//		Set s = new TreeSet();
//		s.add(36);
//		s.add(578);
//		s.add(67);
//		s.add(32);
//		s.add(64);
//		System.out.println(s);
		SortedSet<Object> ss = new TreeSet<>();
//		ss.add(23);
//		ss.add(22);
//		ss.add(22);
		ss.add(2);
		ss.add(1);
		ss.add(3);
		ss.add(5);
		ss.add(4);
    	System.out.println(ss.headSet(2));
    	System.out.println(ss.tailSet(4));
//		System.out.println(ss.first());
//		System.out.println(ss.last());
//		System.out.println(ss.headSet(ss));
//		System.out.println(ss.subSet(1, 2));
	}

		
}
