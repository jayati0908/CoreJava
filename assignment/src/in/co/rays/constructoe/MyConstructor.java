package in.co.rays.constructoe;

import java.util.Date;

public class MyConstructor {
	private String firstName;

	private int age;
	private Date dob;

	public String getFirstName() {
		return firstName;
	}

	public MyConstructor(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;

	}

	public int getAge() {
		return age;
	}

	public Date getDob() {
		return dob;
	}

}
