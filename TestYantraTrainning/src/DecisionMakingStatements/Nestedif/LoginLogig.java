package DecisionMakingStatements.Nestedif;

import java.util.Scanner;

public class LoginLogig {

	public static void main(String[] args) {
		int username = 1234;
		int psd = 1122;
		Scanner sc = new Scanner(System.in);
		System.out.println("********Welcome********");
		System.out.println("Enter the user name");
		int user = sc.nextInt();
		System.out.println("Enter the password");
		int userpsd = sc.nextInt();
		if (username == user) {
			if (psd == userpsd) {
				System.out.println("Login successful");
			}

			else
				System.out.println("Login failed");
		} else
			System.out.println("Enter valid username");
	}

}
