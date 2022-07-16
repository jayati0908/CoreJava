package Testing;

public class Splitting {
	public static void main(String[] args) {
		String a="Jayati chouhan";
		String[] s1=a.split("");
		for(String v:s1) {
			System.out.println(v);
		}
		for(int v=a.length()-1;v<0;v--) {
			System.out.println();
		}
	}
}