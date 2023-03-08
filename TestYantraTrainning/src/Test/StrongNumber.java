package Test;

import java.util.Scanner;

public class StrongNumber 
{
public static void main(String[] args) 
{
	int sum=0;
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num;
	while(num!=0)
	{
		
		int rem=num%10;
		
		sum=sum+fact(rem);
		num=num/10;
	}
	
	if(sum==temp)
		System.out.println("Strong Number");
	else
		System.out.println("Not a Strong number");
}

private static int fact(int rem)
{
	int fact=1;
	for(int i=1;i<=rem;i++)
	{
		fact=fact*i;
	}
	return fact;
}


}
