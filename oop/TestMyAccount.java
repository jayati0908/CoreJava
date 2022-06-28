package in.co.rays.oop;

public class TestMyAccount {
	public static void main(String[] args) {
		MyAccount acc = new MyAccount();

		acc.setAccnum("12345678");
		System.out.println(acc.getAccnum());
		acc.setAcctype("fixed");
		System.out.println(acc.getAcctype());
		acc.setBal(1200D);
		System.out.println(acc.getBal());

		acc.deposit(1000);
		System.out.println(acc.getBal());
		acc.withdrawl(200);
		System.out.println(acc.getBal());

	}

}
