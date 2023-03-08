package Test;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args)
	{
		System.out.println("Enetr the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}else
			{
				flag=true;
			}
		}
		
		
		if(flag)
		{
			System.out.println("not");
		}
			else
			{
			System.out.println("Not a prime number");
			}
	}

}
