package arrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArray {

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
		int ind=0;
		
		for (int i = 0; i < arr3.length; i++) 
		{
			if(i<arr1.length-1)
			
				arr3[i]=arr1[i];
			
			else
			{	
				arr3[i]=arr2[ind];
				ind++;
			}	
		}
		
		System.out.println(Arrays.toString(arr3));

	}

}
