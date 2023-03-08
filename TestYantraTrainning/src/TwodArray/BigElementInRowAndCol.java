package TwodArray;

import java.util.Arrays;
import java.util.Scanner;

public class BigElementInRowAndCol {

	public static void main(String[] args) {
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
		
		int[] Max=new int[arrd.length];
		int[] Min=new int[arrd.length];
		for (int i = 0; i < arrd.length; i++) 
		{
		
			int max=arrd[i][0];
			
			for (int j = 0; j < arrd[i].length; j++) 
			{
				if(arrd[j][i]>max)
				max=arrd[j][i];
			}
			Max[i]=max;
			
			int min=arrd[0][i];
			
			for (int j = 0; j < arrd[i].length; j++) 
			{
				if(arrd[j][i]<min)
				min=arrd[j][i];
			}
			Min[i]=min;
			
		}
			System.out.println("Maximum = "+Arrays.toString(Max));
			System.out.println("Minimum = "+Arrays.toString(Min));
	}

}
