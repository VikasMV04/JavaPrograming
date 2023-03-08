package TwodArray;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEachColums {

	public static void main(String[] args) 
	{
		
Scanner sc = new Scanner(System.in);
		
		int arrd[][]= {{11,13,99},{12,56,88},{22,33,44}};
		
		
		System.out.println();
		for (int i = 0; i < arrd.length; i++) 
		{
			for (int j = 0; j < arrd[i].length; j++) 
			{
				System.out.print(arrd[i][j]+" ");
			}
			System.out.println();
		}
		
		int[] sumofcol=new int[arrd.length];
		for (int i = 0; i < arrd.length; i++) 
		{
			int sum=0;
			for (int j = 0; j < arrd[i].length; j++) 
			{
				sum=sum+arrd[j][i];
			}
			sumofcol[i]=sum;	
		}
			System.out.println(Arrays.toString(sumofcol));
	}

}
