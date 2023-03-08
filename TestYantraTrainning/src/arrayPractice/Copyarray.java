package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Copyarray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enetr the numbers");
		
		for(int i=0;i<size;i++)
		{			
			arr[i]=sc.nextInt();
		}
		int arr2[]=arr;
		
		for(int i=0;i<size;i++)
		{			
			System.out.print(arr[i]+" ");
		}
	

	}

}
