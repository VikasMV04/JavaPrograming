package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysZigzag {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enetr the 1st array elements");
		for (int i = 0; i < arr1.length; i++) 
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enetr the size of 2nd array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];
		System.out.println("Enetr the 2nd array elements");
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i]=sc.nextInt();
		}
		
		int[] arr3=new int[arr1.length+arr2.length];
		int k=0;
		int j=0;
		
		
		for (int i = 0; i < arr3.length;i++) 
		{
			if(k<arr1.length)
			{
				arr3[i]=arr1[k];
				k++;
				i++;
				
			}
			if(j<arr2.length)
			{
				arr3[i]=arr2[j];
				j++;
				
			}	
		}
		
		for (int i = 0; i < arr3.length; i++) 
		{
		System.out.print(arr3[i]+" ");	
		}

	}

}
