package DecisionMakingStatements.Nestedif;

import java.util.Scanner;

public class StudentPercentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		System.out.println("Enter the percentage");
		double per=sc.nextInt();
		
		if(year==2)
		{
			if(per>=80)
			{
				System.out.println("Distinction");
			}
			if(per>=60&&per<=80)
			{
				System.out.println("First Class");
			}
			else if(per>=35&&per<=60)
			{
				System.out.println("Second class");
			}
			else if(per<35)
			{
				System.out.println("Failed");
			}
		}
		else
		{
			System.out.println("Not a student of second year");
		}

	}

}
