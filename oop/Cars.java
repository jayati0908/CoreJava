package in.co.rays.oop;

public class Cars {
	private String colour;
	private int speed;
	private String make;
	private int NoOfGears = 6;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNoOfGears() {
		return NoOfGears;
	}

	public void breakk() {
		if (getSpeed() > 70) {

			System.out.println("Speed is to high");

		}

	}

	public void changeGear(int gear) {
		if (gear == 6) {
			System.out.println(" gear = 6");
		}
		if (gear == 5) {
			System.out.println("gear = 5 ");
		}
		if (gear == 4) {
			System.out.println("gear = 4 ");
		}
		if (gear == 3) {
			System.out.println("gear = 3 ");
		}
		if (gear == 2) {
			System.out.println("gear = 2 ");
		}
		if (gear == 1) {
			System.out.println("gear = 1 ");
		}

	}
	public void accelarator(int acc) {
		if(getSpeed()<70) {
			System.out.println("you need to get accelarated");
		}
		
	}


	
}
