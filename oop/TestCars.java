package in.co.rays.oop;

public class TestCars {
	public static void main(String[] args) {
		Cars my = new Cars();

		my.setColour("Black");
		System.out.println(my.getColour());
		my.setMake("Mercedes");
		System.out.println(my.getMake());
		my.setSpeed(69);
		System.out.println(my.getSpeed());
		my.getNoOfGears();
		System.out.println(my.getNoOfGears());
		my.changeGear(5);
		my.breakk();
		my.accelarator(60);
		
	}

}
