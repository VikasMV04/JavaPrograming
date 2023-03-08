package Loops.whilee;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) 
	{
		int start=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the range(n)");
		int n=sc.nextInt();
		while(start<=n)
		{
			System.out.print(start+" ");
			start++;
		}
	}

}
