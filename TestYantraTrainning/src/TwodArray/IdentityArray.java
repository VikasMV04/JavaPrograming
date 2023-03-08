package TwodArray;

import java.util.Scanner;

public class IdentityArray {

	public static void main(String[] args) {
		{
			int arrd[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
			
//			int arrd[][]=userinput();
			boolean flag = true;
			for (int i = 0; i < arrd.length; i++) 
			{
				for (int j = 0; j < arrd[i].length; j++)
				{
					if(i==j)
					{
						if(arrd[i][j]==1)
						{}
						else {
							flag=false;
							break;
						}
					}
					else if(arrd[i][j]!=0)
					{
						flag=false;
						break;
					}
						
					
				}
			}
			if (flag)
				System.out.println("Identity Matrix");
			else
				System.out.println("Not a Identity Matrix");
		}

	}

	private static int[][] userinput() {
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
