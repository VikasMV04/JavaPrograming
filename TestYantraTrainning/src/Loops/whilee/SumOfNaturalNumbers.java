package Loops.whilee;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int start=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the range(n)");
		int n=sc.nextInt();
		int sum=0;
		while(start<n)
		{	
			sum=sum+n;
			start++;
		}
		System.out.println(sum);
		
//		while()
//		{
//			                
//		}
	}
}
