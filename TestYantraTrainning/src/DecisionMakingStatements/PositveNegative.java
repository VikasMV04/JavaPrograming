package DecisionMakingStatements;

import java.util.Scanner;

public class PositveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		if(no>0)
		{
			System.out.println("positive");
		}
		else{
			System.out.println("negative");
		}
	}

}
