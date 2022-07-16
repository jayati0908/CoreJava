package in.co.rays.collectionsframework;

import java.util.Iterator;
import java.util.Stack;
public class Exanswereight {
	public static void main(String[] args) {
		Stack<Character> stk1 = new Stack();
		Stack<Character> stk2 = new Stack();
		for (char i = 'A'; i <= 'Z'; i++) {
			stk1.push(i);
		}
		Iterator<Character> it = stk1.iterator();
		while (it.hasNext()) {
		stk2.push(stk1.pop());
		
		} for (Character character : stk2) {
			System.out.println(character);
		}Iterator<Character> it2 = stk2.iterator();
		while (it2.hasNext()) {
		System.out.print(stk2.pop());
//			System.out.println(stk2);
		
	}  
	}
}
