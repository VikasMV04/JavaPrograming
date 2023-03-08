package DecisionMakingStatements;

import java.util.Scanner;

public class GivenCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = 'w';
		System.out.println("Enter the character");
		ch = sc.next().charAt(0);
		// System.out.println(ch);
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')||(ch >= 0 && ch <= 9)) 
		{
			if ((ch >= 0 && ch <= 9))
				System.out.println("It is a Number");
			else
				System.out.println("it is a Alphabet");
		}

		else
			System.out.println("It is a special character");

	}

}
