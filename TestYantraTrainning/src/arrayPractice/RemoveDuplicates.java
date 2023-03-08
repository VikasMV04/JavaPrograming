package arrayPractice;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
int a[]={55,1,22,88,55,2,278,278,8899,899,899,1,2,1};
		
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
		}
		System.out.println(Arrays.toString(a));
			int[] r=new int[a.length];
			int ind=0;
			for (int i = 0; i < a.length-1; i++) 
			{
					if(a[i]!=a[i+1])
					{
						r[ind++]=a[i];
					}						
			}
				r[ind++]=a[a.length-1];
			System.out.println(Arrays.toString(r));

		}
	
}
