package DecisionMakingStatements;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the percentage");
		double per=sc.nextDouble();
		if(per>=85)
			System.out.println("Distinction");
		else if(per>=35&&per<85)
			System.out.println("First Class");
		else
			System.out.println("Fail");
		

	}

}
