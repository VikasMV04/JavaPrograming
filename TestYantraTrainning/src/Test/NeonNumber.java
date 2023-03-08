package Test;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		
		int no=9;
		
		int square=no*no;
		int sum=0;
		
		while(square!=0)
		{
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		
		if(sum==no)
			System.out.println("Neon Number");
		else
			System.out.println("Not a neon number");

	}

}
