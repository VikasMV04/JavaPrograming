package Test.Arrays;

public class Zigzag {

	public static void main(String[] args) 
	{
		int[] a= {10,20,30};
		int[] b= {40,50,60};
		
		int[] arr3=new int[a.length+b.length];
		int k=0;
		int j=0;
		
		
		for (int i = 0; i < arr3.length;i++) 
		{
			if(k<a.length)
			{
				arr3[i]=a[k];
				k++;
				i++;
				
			}
			if(j<b.length)
			{
				arr3[i]=b[j];
				j++;
				
			}	
		}
		
		for (int i = 0; i < arr3.length; i++) 
		{
		System.out.print(arr3[i]+" ");	
		}


	}

}
