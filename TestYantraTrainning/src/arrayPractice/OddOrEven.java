package arrayPractice;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enetr the numbers to find it is even or odd");
		for (int d = 0; d < arr.length; d++) 
		{
			arr[d]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]%2==0)
				System.out.println(arr[i]+" is even");
			else
				System.out.println(arr[i]+" is odd");
		}
		 

	}


	

}
