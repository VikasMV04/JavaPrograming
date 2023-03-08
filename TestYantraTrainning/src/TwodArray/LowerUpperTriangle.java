package TwodArray;

import java.util.Scanner;

public class LowerUpperTriangle {

	public static void main(String[] args) {
		
		int arr[][]= {{11,13,88,56,34},{45,12,56,34,88},{22,33,44,88,99},{22,33,44,88,99},{22,33,44,88,99}};

//		userinput();
	
		System.out.println("**********************");
		System.out.println("LowerTriangle");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if(i==j||i>=j)
				{
					System.out.print(arr[i][j]+" ");
				}
				else
					System.out.print("00"+" ");
			}
			System.out.println();
		}
		System.out.println("**********************");
		System.out.println("UpperTriangle");
		System.out.println("**********************");
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if(i>j)
				{
					System.out.print("00"+" ");
				}
				else
					System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void userinput() {
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
		
	}

}
