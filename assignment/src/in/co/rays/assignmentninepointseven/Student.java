package in.co.rays.assignmentninepointseven;

public class Student implements Richman{

	public void donation() {
		System.out.println("student donation");
		
	}

	public void party() {
		System.out.println("student party");
		
	}
	public static void main(String[] args) {
		Richman rm = new Businessman();
		Richman rm1 = new Student();
		rm.donation();
		rm.party();
		rm1.party();
		rm1.party();
	}

}

