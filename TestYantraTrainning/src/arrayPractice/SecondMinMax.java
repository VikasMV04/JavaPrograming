package arrayPractice;

import java.util.Arrays;

public class SecondMinMax {

	public static void main(String[] args) 
	{	
		
		int[] a1= {1212,111,20,2,23,33,1};
		int secondmin=0;
		int thirdmin=0;
		int min=0;

		if(a1[0]<a1[1]&&a1[0]<a1[2])
		{
			min=a1[0];
			if(a1[1]<a1[2])
			{
				secondmin=a1[1];
				thirdmin=a1[2];
			}
			else
			{
				secondmin=a1[2];
				thirdmin=a1[1];
			}
		}
		else{
			if(a1[1]<a1[2])
			{
				min=a1[1];
				secondmin=a1[2];
				thirdmin=a1[0];
			}else {
				min=a1[2];
				secondmin=a1[1];
				thirdmin=a1[0];
			}
			
		}
		
		
		for (int i = 3; i < a1.length; i++) 
		{
			if(a1[i]<min)
			{
				thirdmin=secondmin;
				secondmin=min;
				min=a1[i];
			}
			
			else if(a1[i]<secondmin)
			{
				thirdmin=secondmin;
				secondmin=a1[i];
			}
			else
			thirdmin=a1[i];
		}
		System.out.println(min);
		System.out.println(secondmin);
		System.out.println(thirdmin);

}

}
