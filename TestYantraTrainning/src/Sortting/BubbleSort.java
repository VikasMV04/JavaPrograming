package Sortting;

import java.util.Arrays;


public class BubbleSort {

	public static void main(String[] args) 
	{
		int a[]={55,22,4666,88,2,1};
		
		for (int i = a.length-1; i >=0; i--) 
		{
			for (int j = 0; j < i; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}

//		recbublwe(a);
//		System.out.println(Arrays.toString(a));
	}

	private static void recbublwe(int[] a) 
	{
		for (int i = a.length-1; i >0; i--)
		{
			sort(a,i);
			
			
		}
		
	}

	private static int[] sort(int[] a, int i) 
	{
		if(i<=0)
		{
			return a;
		}
		
		
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		
		return sort(a,i--);
		
		
	}

}
