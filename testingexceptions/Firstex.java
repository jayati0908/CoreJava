package in.co.rays.testingexceptions;

public class Firstex {
	public static void main(String[] args) {
//		double i = 0;
//		double k = 15;
		try {
		double div = 15/3;
		System.out.println(div);
		}
		catch(ArithmeticException e) {
			System.err.println("you can't divide by zero");
		}
		finally {
			System.out.println("it will run : FINALLY");
		}
	}

}
