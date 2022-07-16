package Testing;

public class Reversing {
	public static void main(String[] args) {
		String a = "jayati chouhan";
		String[] b = a.split(" ");
		for (int i = 0; i < b.length; i++) {
			for (int j = b[i].length() - 1; j >= 0; j--) {
				System.out.print(b[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
