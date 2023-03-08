package DecisionMakingStatements.Nestedif;

import java.util.Scanner;

public class GreaterNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
			if(num>=100)
			{
				if(num<=200)
					System.out.println("The number is in range of 100 to 200");
				else
					System.out.println("The number is not in range from 100 to 200");
			}
			else
			{
				System.out.println("Number is less then 100");
			}
	}

}
