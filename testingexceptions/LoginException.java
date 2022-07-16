package in.co.rays.testingexceptions;

public class LoginException{
	public static void main(String[] args)  {
	email("admin");
}
	private static void email(String login)  {
		if(!login.equals("admin")) {
			Myexception e=new Myexception();
			try {
			throw e;
			}
			catch(Myexception e2) {
				System.out.println(e2.getMessage());
			}
		}else {
			System.out.println("gggggg");
		}
	}


}