package in.co.rays.basics;

public class Sum {
	public static void main(String[] args) {
		int x=0;
		for(int i=100;i<=200;i++) {
			if(i%7==0) {
			x=i+x;
		}
	}System.out.println(x);
	}
}

