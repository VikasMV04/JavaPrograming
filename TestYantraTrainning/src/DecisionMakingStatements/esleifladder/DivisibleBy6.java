package DecisionMakingStatements.esleifladder;

import java.util.Scanner;

public class DivisibleBy6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		if(no%6==0)
		{
			System.out.println(no+" is multiple by 6");
		}
		else
			System.out.println("Not multiple by 6");

	}

}
