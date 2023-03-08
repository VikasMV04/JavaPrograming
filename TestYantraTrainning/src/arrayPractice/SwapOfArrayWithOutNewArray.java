package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class SwapOfArrayWithOutNewArray {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enetr the 1st array elements");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		
		int index=arr.length-1;
		for (int i = 0; i < arr.length/2; i++) 
		{
					int temp=arr[i];
					arr[i]=arr[index];
					arr[index--]=temp;
					
					
		}
		System.out.println(Arrays.toString(arr));
	}

}
