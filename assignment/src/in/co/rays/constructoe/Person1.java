package in.co.rays.constructoe;

import java.util.Date;

public class Person1 {
	private String name;
	private int address;
	private String adr;
	private Date dob;
	public int AVG_AGE 	= 22;
	
	public Person1(String name,int AVG_AGE) {
		this.name = name;
		this.AVG_AGE = AVG_AGE;
	}
	public String getName() {
		return name;
	}
	public int getAVG_AGE() {
		return AVG_AGE;
	}
	public Person1(int address,String adr) {
		this.address = address;
		this.adr = adr;
	}
	public int getAddress() {
		return address;
	}
	public String getAdr() {
		return adr;
	}
	public Person1(Date dob) {
		this.dob = dob;
	}
	public Date getDob() {
		return dob;
	}
}
