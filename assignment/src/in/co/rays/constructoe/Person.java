package in.co.rays.constructoe;

public class Person {

	private String name;
	private int age;

	public Person() {

		System.out.println("I am default");

	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

		System.out.println("1 parameter const");

	}

	public String getName() {
		return name;
	}

	
	public int getAge() {
		return age;
	}

	
}
