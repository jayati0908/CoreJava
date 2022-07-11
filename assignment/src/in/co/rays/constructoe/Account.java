package in.co.rays.constructoe;

public class Account {
	private int accountNumber;
	private String type;
	private double balance;
	
	public Account(int accountNumber,String type) {
		this.accountNumber = accountNumber;
		this.type = type;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getType() {
		return type;
	}
	public Account(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(int d) {

		double total = getBalance() + d;

		setBalance(total);

	} 
	public void withdrawl(int w) {
		double total = getBalance()-w;
		setBalance(total);
	}
	
}
			