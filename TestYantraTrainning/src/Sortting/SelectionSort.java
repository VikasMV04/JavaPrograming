package Sortting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int[] a= {4,74,48,65,1,2};
		for (int i = 0; i < a.length-1; i++) 
		{
			int min=i;
			
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]<a[min])
				{
					min=j;
				}	
			}
			
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
	}
		System.out.println(Arrays.toString(a));
	}
}
