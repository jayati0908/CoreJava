package in.co.rays.collectionsframework;

import java.util.ArrayDeque;

public class TypeofQues {
	public static void main(String[] args) {
		ArrayDeque dq = new ArrayDeque<>();
		dq.add(11);
		dq.add(112);
		dq.add(111);
		dq.add(1);
		dq.addFirst(29);
		dq.addLast(30);
		System.out.println(dq.poll());
		System.out.println(dq);
	}

}
