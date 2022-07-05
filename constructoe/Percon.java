package in.co.rays.constructoe;

public class Percon {
	private String firstName=null;
	private String lastName=null;
	private String address=null;

	public Percon() {
		System.out.println("i am default person");
	}
	public Percon(String fn,String ln) {
		fn = firstName;
		ln = lastName;
		System.out.println("i am two paramaterized");
	}
	public Percon(String fn, String ln,String adr) {
		this(fn,ln);
		adr  = address;
		System.out.println("i am three parametarized");
	}
	public static void main(String[] args) {
		Percon p = new Percon("jayati","chouhan","indore");
		
	}
	
}
