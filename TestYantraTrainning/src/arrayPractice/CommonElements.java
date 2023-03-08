package arrayPractice;

import java.util.Scanner;

public class CommonElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enetr the size of array");
//		int size=sc.nextInt();
//		int arr1[]=new int[size];
//		System.out.println("Enetr the 1st array elements");
//		for (int i = 0; i < arr1.length; i++) 
//		{
//			arr1[i]=sc.nextInt();
//		}
//		
//		System.out.println("Enetr the size of 2nd array");
//		int size2=sc.nextInt();
//		int arr2[]=new int[size2];
//		System.out.println("Enetr the 2nd array elements");
//		for (int i = 0; i < arr2.length; i++) 
//		{
//			arr2[i]=sc.nextInt();
//		}
		int[] arr1={1,2,2};
		int[] arr2={1,2,5};
		System.out.println("Common Elements are");
		for (int j = 0; j < arr1.length; j++) 
		{
			int count=0;
			for (int i = 0; i < arr2.length; i++) 
			{
				
				if(arr1[i]==arr2[j])
				{
					count++;
					if(count==1)
					System.out.print(arr1[j]+" ");
				}
			}
		}

	}

}
