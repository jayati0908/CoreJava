package in.co.rays.constructoe;

public class TestMyCars {
	public static void main(String[] args) {
		MyCars car = new MyCars("Black","Mercedes",90);
		System.out.println(car.gears);
		System.out.println(car.getColour());
		System.out.println(car.getCompany());
		System.out.println(car.getSpeed());
		car.getAccelarator();
		car.getBrake();
	}

}
