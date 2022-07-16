package in.co.rays.testingexceptions;

public class Firstex {
	public static void main(String[] args) {
//		double i = 0;
//		double k = 15;
		try {
		double div = 15/0;
		System.out.println(div);
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("it will run : FINALLY");
		}
	}

}
