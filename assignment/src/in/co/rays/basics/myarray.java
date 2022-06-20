package in.co.rays.basics;

public class myarray {
	public static void main(String[] args) {
		// int [] a= {1,2,3,4,5};
		// String [] name= {""};
		// System.out.println(name[1]);
		// }

//	int [] arr =new int[5];{
//	arr[0]=56;
//	arr[1]=88;
//	arr[2]=32;
//	for(int i:arr)
//	System.out.println(i);
//	}
		int[][] t = new int[3][3];
		
			t[0][0] = 2;
			t[0][1] = 3;
			t[0][2] = 4;
			t[1][0] = 8;
			t[1][1] = 9;
			t[2][0] = 1;
			t[2][1] = 2;
			t[2][2] = 3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(t[i][j]);
		}
		System.out.println();	
		}
	}
}