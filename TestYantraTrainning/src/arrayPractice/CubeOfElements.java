package arrayPractice;

import java.util.Scanner;

public class CubeOfElements {

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
		
		for(int i=0;i<size;i++) 
		{
			int res=arr[i]*arr[i]*arr[i];
			System.out.println("Cube of "+arr[i]+" "+res);
		}
		
		
		
	}
}
