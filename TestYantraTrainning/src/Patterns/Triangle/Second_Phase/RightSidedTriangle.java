package Patterns.Triangle.Second_Phase;

public class RightSidedTriangle {

	public static void main(String[] args)
	{
        int n=5;
		for(int r=1;r<=n;r++)
		{
			for(int i=1;i<=n-r;i++)//printing space
			{
				System.out.print("  ");
			}
			for(int k=1;k<=r;k++)//printing star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("***********************");
		System.out.println();  
		System.out.println("***********************");
		for(int r=5;r>=0;r--)
		{
			for(int i=1;i<=n-r;i++)//
			{
				System.out.print("  ");
			}
			for(int k=1;k<=r;k++)//
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
