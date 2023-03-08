package DecisionMakingStatements;

import java.util.Scanner;

public class MultipleOf8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		if(no%8==0)
		{
			System.out.println(no+" is divisible by 8");
		}
		else
			System.out.println("Not divisible by 8");

	}

}
