package arrayPractice;

public class SecondMax
{
	static int max;
	static int secondmax;
	public static void main(String[] args) 
	{
		int[] a1= {111,110,202,2,1111};
		a1[0]= null;
		max=(a1[0] > a1[1] ? a1[0] :a1[1] );
		
		for (int i = 1; i < a1.length; i++) 
		{
			if(a1[i]>max)
			{
				secondmax=max;
				max=a1[i];
			}
		}
		System.out.println("Second maximum value = "+secondmax);
		System.out.println("Second maximum value = "+secondmax);
		
	}

}
