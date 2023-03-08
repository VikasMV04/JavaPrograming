package TwodArray;

import java.util.Scanner;

public class FrequencyOfElements {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int arrd[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int evencount=0;
		int oddcount=0;
		
		for (int i = 0; i < arrd.length; i++) 
		{
			for (int j = 0; j < arrd[i].length; j++) 
			{
				System.out.print(arrd[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < arrd.length; i++) 
		{
			for (int j = 0; j < arrd[i].length; j++) 
			{
				if(arrd[i][j]%2==0) evencount++;
				else oddcount++;
			}
		}
		
		System.out.println("Even = "+evencount);
		System.out.println("Odd  = "+oddcount);

	}

}
