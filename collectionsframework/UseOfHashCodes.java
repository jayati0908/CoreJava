package in.co.rays.collectionsframework;

import java.util.HashMap;

public class UseOfHashCodes {
	public static void main(String[] args) {
//		String s = "java";
//		String s1 = "Jayati";
//		System.out.println(""+s.hashCode()+" : "+s1.hashCode());
		HashMap m = new HashMap();
		HashMap m1 = new HashMap();
		m.put(1, "jayati");
		m1.put(2, "shul");
		//System.out.println(m.hashCode());
		System.out.println(m.hashCode()+":"+m1.hashCode());
		
	}

}
