package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class dooubleUserInput {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		double arr[]=new double[size];
		System.out.println("Enetr the numbers");
		for(int i=0;i<size;i++)
		{
			
			arr[i]=sc.nextDouble();
			
		}


			System.out.println(Arrays.toString(arr));
			
	}

}
