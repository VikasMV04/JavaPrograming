package TwodArray;

import java.util.Iterator;
import java.util.Scanner;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arrd[][]= {{11,22,3},{22,95,998}};
		int arrd1[][]= {{1,2,3},{2,5,8}};
		
		
		for (int i = 0; i < arrd.length; i++) 
		{
			for (int j = 0; j < arrd[i].length; j++) 
			{
				System.out.print(arrd[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arrd1.length; i++) 
		{
			for (int j = 0; j < arrd1[i].length; j++) 
			{
				System.out.print(arrd1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int Addres[][]=new int[arrd.length][arrd[0].length];
		int Subres[][]=new int[arrd.length][arrd[0].length];
		int[][] Mulres=new int[arrd.length][arrd[0].length];
		for (int i = 0; i < arrd.length; i++) 
		{
			for (int j = 0; j < arrd[i].length; j++) 
			{
				Addres[i][j]=arrd[i][j]+arrd1[i][j];
				Subres[i][j]=arrd[i][j]-arrd1[i][j];
				
				Mulres[i][j]=arrd[i][j]-arrd1[i][j];
			}
			
		}
		
		//Addition of Two Matrix
		for (int i = 0; i < Addres.length; i++) 
		{
			for (int j = 0; j < Addres.length; j++) {
				System.out.print(Addres[i][j]+" ");
			}
			System.out.println();
		}
		 
		 
		//Subtraction of Two Matrix
		for (int i = 0; i < Subres.length; i++) 
		{
			for (int j = 0; j < Subres[i].length; j++)
			{
				System.out.print(Subres[i][j]+" ");
			}
			System.out.println();
		}
		
		//Multiplication of Two Matrix
		System.out.println("Multiplication of Two Matrix");
		for (int i = 0; i < Subres.length; i++) 
		{
			for (int j = 0; j < Mulres[i].length; j++)
			{
				System.out.print(Mulres[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
