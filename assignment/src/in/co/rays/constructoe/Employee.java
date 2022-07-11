package in.co.rays.constructoe;

public class Employee extends Percon{
	private String designation=null;

	public Employee() {
		System.out.println("i am default employee");
	}
	public Employee(String fn,String ln,String des) {
		super(fn,ln);
		des = designation;
		System.out.println("i am using super keyword which's extended to Percon");
	}
	public static void main(String[] args) {
		Employee emp = new Employee("nikkie","chouhan","stack devlprXS");
		
	}
}
