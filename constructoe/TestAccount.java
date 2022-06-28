package in.co.rays.constructoe;

public class TestAccount {
	public static void main(String[] args) {
		Account acc1 = new Account(12345,"Fixed Deposit");
		System.out.println(acc1.getAccountNumber());
		System.out.println(acc1.getType());
		acc1.setBalance(5000);
		acc1.deposit(2000);
		acc1.withdrawl(1000);
		System.out.println(acc1.getBalance());
		System.out.println(acc1.getBalance());
		System.out.println(acc1.getBalance());
	}

}
