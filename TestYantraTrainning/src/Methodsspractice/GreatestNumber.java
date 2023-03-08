package Methodsspractice;

import java.util.Scanner;

public class GreatestNumber 
{
	static int a;
	static int b;
	static int c;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
			greatestOfNumbers();
	}

	public static void greatestOfNumbers() 
	{
		System.out.println("Eneter the number");
		a=sc.nextInt();
		System.out.println("Eneter the number");
		b=sc.nextInt();
		System.out.println("Eneter the number");
		c=sc.nextInt();//                     |    F    | 
		System.out.println((a>b && a>c) ? a  : b>c?b : c +" Is greater");
//                                        |        |   |
//										 |T|       t   f	
	}									

}
