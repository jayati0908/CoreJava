package in.co.rays.oop;

public class Emp {

	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void missing(int[] a, int[] b) {
		int k = 0;
		int x = 0;
		int miss = 0;
		for (int i : a) {
			k = k + i;
		}
		for (int j : b) {
			x += j;
		}
		miss = k - x;
		System.out.println("your missing element is:" + miss);
	}

}
