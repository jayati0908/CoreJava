package in.co.rays.basics;

public class myfib {
	public static void main(String[] args) {
		int no=10;
		int first=0;
		int second= 1;
		for(int i=1;i<=no;i++) {
			System.out.print(first+",");
			int third=first+second;
			first=second;
			second=third;
		}
		
	
	}

}