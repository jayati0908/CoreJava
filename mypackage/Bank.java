package in.co.rays.mypackage;

public class Bank {
	private double interestRate;
	private String name;

	public double interestRate() {
		return 0.0;
	}

	public String getName() {
		return "";
	}

	public static Bank getBank(int i) {
		if (i == 1)
			return new AxisBank();

		if (i == 2)
			return new HDFC();

		if (i==3)
			return new ICICIBank();
		return null;

	}
}
