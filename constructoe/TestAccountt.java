package in.co.rays.constructoe;

public class TestAccountt {
	public static void main(String[] args) {
		Accountt acc = new Accountt("445756", "Saving Account");
		Accountt acc1 = new Accountt(6000);
		System.out.println(acc.getAccountNumber());
		System.out.println(acc.getAccountType());
		System.out.println(acc1.getBalance());
		acc1.Deposit(3000);
		System.out.println(acc1.getBalance());
		acc1.Withdraw(500);
		System.out.println(acc1.getBalance());
		acc1.FundTransfer(1000);
		System.out.println(acc1.getBalance());
		acc1.PayBill(500);
		System.out.println(acc1.getBalance());
	}

}
