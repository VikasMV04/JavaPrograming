package Methods;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Eneter the number");
		int num=sc.nextInt();
		System.out.println("Is Prime or not : "+isPrime(num));
		System.out.println("Factorial of numbers is : "+factorial(num));
		fibonacci(num);
		
	}

	private static void fibonacci(int num) {
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Fibonacci sereis");
//		System.out.print(a+" ");
//		System.out.print(b+" ");
		for (int i = 1; i <=num; i++) 
		{
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
		return ;
	}

	public static long factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	private static boolean isPrime(int num) {
		boolean flag=true;
		for (int i = 2; i <=num/2; i++) 
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

}
