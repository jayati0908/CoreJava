package Testinganonymous;

public class CalculationsUsingLambdaex {
public static void main(String[] args) {
	Arithmetic ad =( a, b)->{
		//System.out.println(a+b);
		return a+b;
	};
	int sum = ad.Calc(90,6);
	System.out.println(sum);
//	Arithmetic mult =(a,b)->{
//		System.out.println(a*b);
//		
//	};
//	mult.Calc(9,60);
//	Arithmetic div =(a,b)->{
//		System.out.println(a/b);
//		
//	};
//	div.Calc(9,6);
}
}
