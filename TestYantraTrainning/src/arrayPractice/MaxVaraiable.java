package arrayPractice;

import java.util.Scanner;

public class MaxVaraiable {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enetr the numbers");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
