package in.co.rays.collectionsframework;

import java.util.HashSet;

public class Testing extends Employee4{
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("jayati");
		System.out.println(h.hashCode());
		System.out.println(h.equals(h));
	}

}
