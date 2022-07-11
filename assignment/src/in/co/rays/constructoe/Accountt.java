package in.co.rays.constructoe;

public class Accountt {
	private String accountNumber;
	private String accountType;
	private double balance;


	public Accountt(String accountNumber, String accountType) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}
	public Accountt(double b) {
		balance = b;
	}
	public double getBalance() {
		return balance;
	}

	public void Deposit(double d) {
		balance = balance + d;
	}
	public void Withdraw(double w) {
		balance = balance - w;
	}
	public void FundTransfer(double fund) {
		balance  = balance - fund;
	}
	public void PayBill(double pb) {
		balance = balance - pb;
	}
}
