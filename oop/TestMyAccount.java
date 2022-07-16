package in.co.rays.oop;

import in.co.rays.testingexceptions.Myexception;

public class TestMyAccount {
	public static void main(String[] args) throws Myexception {
		MyAccount acc = new MyAccount();

//		acc.setAccnum("12345678");
//		System.out.println(acc.getAccnum());
//		acc.setAcctype("fixed");
//		System.out.println(acc.getAcctype());
		
		acc.setBal(1200);
		
		System.out.println(acc.getBal());

		//acc.deposit(1000);
		System.out.println(acc.getBal());
		
		acc.withdrawl(2000);
		System.out.println(acc.getBal());
		
	}

}
