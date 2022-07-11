package in.co.rays.mypackage;

public class HomeLoan {

	public static void main(String[] args) {

		// Bank bank = new Bank();

		for (int i = 1; i < 4; i++) {

			Bank b = Bank.getBank(i);

			System.out.println("Our Bank's name is : " + b.getName());

			System.out.println("our Bank's interest rate is : " + b.interestRate());
			System.out.println("________________________________");
		}

	}
}