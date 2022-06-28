package in.co.rays.constructoe;

public class MyCars {
	private String colour;
	private String company;
	private int speed;
	public static final int gears = 6;
	
	public MyCars(String colour,String company,int speed) {
		this.colour = colour;
		this.company = company;
		this.speed = speed;
	}
	public String getColour() {
		return colour;
	}
	public String getCompany() {
		return company;
	}
	public int getSpeed() {
		return speed;
	}
	public void getBrake() {
		if(getSpeed()>70) {
			System.out.println("you need to press brake");
		}
	}
	public void getAccelarator() {
		if(getSpeed()<20) {
			System.out.println("you need to be accelarated");
		}
	}
	
}
