package arrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Palind {

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
		int ar2[]= new int[arr.length];
		int index=0;
		for (int i = arr.length-1; i >=0; i--) 
		{
			ar2[index++]=arr[i];
		}
		System.out.println(Arrays.toString(ar2));
		boolean flag=true;
		
			for (int i = 0; i < ar2.length; i++) 
			{
				
				if(arr[i]==ar2[i])
				{}	
				else
				{
					flag=false;
					break;
				}
			}
		
		
		if(flag)
		{
			System.out.println("Palindrome");
		}else
			System.out.println("Not palindrome");
		
	}

}
