package in.co.rays.collectionsframework;

import java.util.ArrayList;
import java.util.List;

public class Practisingcf {
	public static void main(String[] args) {
		List a1 = new ArrayList<>();
		//a1.add(12);
		//a1.add(30);
		//a1.add(40);
		a1.add(56);
		a1.add('p');
		a1.add("jayati");
		System.out.println(a1);
		//a1.clear();
		//System.out.println(""+a1.remove('p'));
//		System.out.println("the size is :"+a1.size());
//		System.out.println("your list is not empty"+a1.isEmpty());
		a1.remove("jayati");
		System.out.println(a1);
		
		
		
//		List a2 = new ArrayList<>();	
//		a2.add(56);
//		a2.add('p');
//		a2.add("jayati");
//		//a2.add(67);
//		System.out.println(a2);
//		System.out.println(a1.containsAll(a2));//a1 has all elements if a2
//		System.out.println(a2.containsAll(a1));//a2 has all the elements of a1
//		System.out.println(a1.contains(59));//when a1 contains given object (boolean)
//		System.out.println(a1.isEmpty());//whether a1 is empty or not
//		System.out.println("removed element is :"+a2.remove(1));
//		
//		System.out.println("remove all:"+a2.removeAll(a1));//print only uncommon elements
//		System.out.println(a2.remove("jayati"));
//		System.out.println(a1.retainAll(a2));//print only common elemnts
//		
}
}