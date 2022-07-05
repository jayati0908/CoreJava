package in.co.rays.assignmentninepointseven;

public final class Immutable {

	private final String color;
	private final int borderWidth;

	public Immutable(String color, int borderWidth) {

		this.color = color;
		this.borderWidth = borderWidth;

	}

	public String getColor() {
		return color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public static void main(String[] args) {

		Immutable i = new Immutable("Red", 10);

		System.out.println(i.getColor());
		System.out.println(i.getBorderWidth());

	}

}
