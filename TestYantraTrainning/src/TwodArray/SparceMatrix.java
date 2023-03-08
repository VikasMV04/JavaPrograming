package TwodArray;

import java.util.Scanner;

public class SparceMatrix {

	public static void main(String[] args) 
	{
		int[][] arr= {{1,0,3},{4,0,6},{0,0,0}};
//		int[][] arr=userinput();
		int zeroc=0;
		int nuc=0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if(arr[i][j]==0) zeroc++;
				else nuc++;	
			}
		}
		if(zeroc>(arr.length*arr.length)/2) System.out.println("It is a Sparse Matrix");
		else System.out.println("Not a Sparce matrix");
	}

	public static int[][] userinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no of rows");
		int row=sc.nextInt();
		System.out.println("Enetr the no of columns");
		int col=sc.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enetr the data for row "+(i+1));
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
		
	}

}
