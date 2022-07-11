package in.co.rays.basics;

public class Mytable {
	public static void main(String[] args) {
		int [][] table=new int [10][10];
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				table[i][j]=i*j;
				System.out.print(table[i][j]+"\t");
			}System.out.println();
		}
	}

}
