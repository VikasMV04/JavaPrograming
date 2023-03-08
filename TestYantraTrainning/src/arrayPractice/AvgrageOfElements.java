package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class AvgrageOfElements {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr the size of array");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enetr the numbers");
			int sum=0;
			for(int i=0;i<size;i++)
			{
				
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
				
			}
			int avg=sum/size;

				System.out.println(avg);
				
		}// TODO Auto-generated method stub

	}

}
