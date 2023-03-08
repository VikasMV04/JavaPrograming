package TwodArray;

import java.util.Scanner;

public class MaxOf2DArray {

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
		
		int arrd[][]= {{11,13,99},{12,56,88},{22,33,456}};
		
		for (int i = 0; i < arrd.length; i++) 
		{
			for (int j = 0; j < arrd[i].length; j++) 
			{
				System.out.print(arrd[i][j]+" ");
			}
			System.out.println();
		}
		
		int max=arrd[0][0];
		int min=arrd[0][0];
		for (int i = 0; i < arrd.length; i++) 
		{
			for (int j = 0; j < arrd[i].length; j++) 
			{
				if(arrd[i][j]>max)
				max=arrd[i][j];
				
				if(arrd[j][i]<min)
					min=arrd[j][i];
			}
			
		}
		System.out.println("Maximum = "+max);
		System.out.println("Maximum = "+min);
	}

}
