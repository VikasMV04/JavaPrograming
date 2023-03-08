package ConditionalAssign;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the number");
	int num=sc.nextInt();
	int sum=0;
	for (int i = 1; i < num; i++) 
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
		
	}
	
	if(num==sum)
		System.out.println("Perfect number");
	else
		System.out.println("Not a perfect number");
}
}
