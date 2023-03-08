package Alphabets;

public class NameS 
{

	public static void main(String[] args)
	
	{
		int n=5;
		for (int r = 1; r <=n; r++) 
		{
			for(int v=1;v<=5;v++)
			{
				if(v==1&&r<n/2+1||r-v==n/2||r+v==n+n/2+1||v==n&&r<n/2+1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("  ");
			
			for (int i = 1; i <=n; i++) 
			{
				if(r==1||i==n/2+1||r==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
System.out.print("  ");
			
			for (int k = 1; k <=n; k++) 
			{
				if(k==1||r-k==n/2||r+k==n/2+2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			
			for (int a = 1; a <=n; a++) 
			{
				if(a==1||r==1||a==n||a==n||r==n/2+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
System.out.print("  ");
			
			for (int s = 1; s <=n; s++) 
			{
				if(r==1||s==1&&r<n/2+1||r==n/2+1||s==n&&r>=n/2+1||r==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	
	}
	

}
