package in.co.rays.myinheritanceandpolymorphism;

public class MyPolymorphism{
	public static void main(String[] args) {
		Shape [] s = new Shape[3];
		s[0] = new Rectangle() ;
		s[1] = new Triangle();
		s[2] = new Circle();
		for(int i=0;i<s.length;i++) {
			s[i].area();
		}System.out.println("________________________");
	
		double totalArea = calcArea(s);
		System.out.println(totalArea);
			
}
	
	
	public static double calcArea(Shape[]s) {
		double totalArea=0;
	for(int i=0;i<s.length;i++) {
		
		totalArea = totalArea +s[i].area();

	}	
	return totalArea;
	}
	}