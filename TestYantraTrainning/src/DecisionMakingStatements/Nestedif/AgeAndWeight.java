package DecisionMakingStatements.Nestedif;

import java.util.Scanner;

public class AgeAndWeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the weight");
		int weight=sc.nextInt();
		
		if(age>25)
		{
			if(weight>60)
			{
				System.out.println("Eligible for boxing competition");
			}
				else
				{
				System.out.println("Not Eligible");
				}
	    }
		else
			System.out.println("Under age-Not eligible");
	}
}
