package in.co.rays.testingexceptions;

public class Testingexceptions {
	public static void main(String[] args) {
		String s = "jayati";
		try {
			double div = 15/0;
			System.out.println(s.length());
			System.out.println(s.charAt(6));
		} catch (NullPointerException e) {
			System.out.println("string is empty");
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
