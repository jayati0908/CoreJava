package Testinganonymous;

import java.util.ArrayList;

public class TestingForEachMethod {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(56);
		l.add(84);
		l.add(34);
		l.add(56);
		l.add(12);
		System.out.println(l);
		l.forEach((li)->{System.out.println(li);});
		}

}
