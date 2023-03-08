package TwodArray;

import java.util.Scanner;

public class UserInputCreation 
{
	static int row;
	static int col;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the no of rows");
		row=sc.nextInt();
		System.out.println("Enetr the no of columns");
		col=sc.nextInt();
		int[][] arr = new int[row][col];
//		for (int i = 0; i < arr.length; i++) 
//		{
//			System.out.println("Enetr the data for row "+(i+1));
//			for (int j = 0; j < arr[0].length; j++) 
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		
		for (int i = 0; i < arr.length; i++) 
		{
			
			for (int j = 0; j < arr[0].length; j++) 
			{
				System.out.print( arr[i][j]+" ");
			}
			System.out.println();
		}
//		
//		System.out.println("Enetr the no of rows");
//		 row=sc.nextInt();
//		System.out.println("Enetr the no of columns");
//		 col=sc.nextInt();
//		char[][] arr1 = new char[row][col];
////		for (int i = 0; i < arr1.length; i++) 
////		{
////			System.out.println("Enetr the data for row "+(i+1));
////			for (int j = 0; j < arr1[0].length; j++) 
////			{
////				arr1[i][j]=sc.next().charAt(0);
////			}
////		}
//		
//		for (int i = 0; i < arr1.length; i++) 
//		{
//			
//			for (int j = 0; j < arr1[0].length; j++) 
//			{
//				System.out.print( arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
		

	}

}
