package in.co.rays.test;

public class Mysoleigth {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int no=2;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			k++;
			if(arr[i]==no) {
				k=i;
			}
		}if(k==0) {
			System.out.println("-1");
		}
		
	}

}
