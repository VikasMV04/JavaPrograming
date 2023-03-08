package Test.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,44,5,55};
		
		
		int no=3;
		int ind=0;

		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i <a.length; i++) 
		{
			if(i==no)
			{
			}
			else
			a[ind++]=a[i];		
		}
		a[a.length-1]=0;
		System.out.println(Arrays.toString(a));


	}

}
