package DecisionMakingStatements;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(ch>='a'&&ch<='z')
			System.out.println("lowercase");
		else
			System.out.println("Uppercase");
	}
}
