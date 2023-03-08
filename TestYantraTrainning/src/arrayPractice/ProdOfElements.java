package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ProdOfElements {

	public static void main(String[] args) 
	{
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr the size of array");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enetr the numbers");
			int prod=1;
			for(int i=0;i<size;i++)
			{
				
				arr[i]=sc.nextInt();
				prod=prod*arr[i];
				
			}


				System.out.println(prod);
				
		}
	}

}
