package arrayPractice;

import java.util.Scanner;

public class PrimenUMBER {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enetr the numbers to find it is prime or not");
		for (int d = 0; d < arr.length; d++) 
		{
			arr[d]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) 
		{
			int no=arr[i];
			boolean flag=true;
			for (int j = 2; j < no/2+1; j++) 
			{
				if(no%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("prime Number");
			else
				System.out.println("Not a prime number");
			
		}
		 

	}

}
