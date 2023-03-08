package Test.Arrays;

public class Secmin {
	static int min;
	static int secmin;
	public static void main(String[] args) 
	{
int[] a1= {111,110,202,2,1111};
		
		min=(a1[0] < a1[1] ? a1[0] :a1[1] );
		
		for (int i = 1; i < a1.length; i++) 
		{
			if(a1[i]<min)
			{
				secmin=min;
				min=a1[i];
			}
		}
		System.out.println("Second maximum value = "+secmin);
	}

}
