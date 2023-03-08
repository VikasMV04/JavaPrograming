package Projectss;

import java.util.Scanner;

public class FoodOrderingProgram {

	static String name;
	static String email;
	static long number;
	static String password;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		createAccont();
		// ****************************************************************************
		System.out.println("********Login********");

		System.out.println("Enetr the email  id");
		String chkemail = sc.next();
		System.out.println("Enetr the passwod");
		String chkpwd = sc.next();
		if (chkemail.equals(email)) 
		{
			if (password.equals(chkpwd)) 
			{
				System.out.println("Login sucessfully");
				System.out.println("************************");
				System.out.println("Choose Restrunt\n1.The Wave\n" + "2.Soundarya Paradice\n" + "3.Agarval Bhavan\n"
						+ "4.Dharshini\n" + "5.Pakka Shalla");
				int logselection = sc.nextInt();
				switch (logselection) {
				case 1: {
					thewave();
					break;
				}
				case 2: {
					Soundaryaparadice();
					break;
				}
				case 3: {
					break;
				}
				case 4: {
					break;
				}
				case 5: {
					break;
				}
				}
			} else {
				System.out.println("Password is wrong");
			}
		}

		else {
			System.out.println("User name or password is wrong");
		}

	}

	private static void Soundaryaparadice() {
		System.out.println("*********************");
		System.out.println("*********************");
		System.out.println("Welcome to The Soundarya paradice");
		System.out.println("*********************");
		System.out.println("DISHES");
		System.out.println("*********************");
		System.out.println("1.Dosa(50rs)");
		String dish1 = "Dosa";
		int dish1cost = 50;
		System.out.println("2.Idly(70rs)");
		String dish2 = "Idly";
		int dish2cost = 70;
		System.out.println("3.Puri(50rs)");
		String dish3 = "Puri";
		int dish3cost = 50;
		System.out.println("4.South Meals(100rs)");
		String dish4 = "South Meals";
		int dish4cost = 100;
		System.out.println("4.South Meals(100rs)");
		String dish5 = "North Meals";
		int dish5cost = 120;
		int disselc = sc.nextInt();
		switch (disselc) {
		case 1: {
			System.out.println("Your dish" + dish1 + "is order");
			System.out.println("Pay the amount of" + dish1cost + "rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 2: {
			System.out.println("Your dish " + dish2 + " is order");
			System.out.println("Pay the amount of" + dish2cost + "rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 3: {
			System.out.println("Your dish " + dish3 + " is order");
			System.out.println("Pay the amount of " + dish3cost + " rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 4: {
			System.out.println("Your dish " + dish4 + " is ordered");
			System.out.println("Pay the amount of " + dish4cost + " rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 5: {
			System.out.println("Your dish" + dish5 + "is order");
			System.out.println("Pay the amount of " + dish5cost + " rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		}
	}
		
	

	// *********************************************************
	private static void thewave() {
		System.out.println("*********************");
		System.out.println("*********************");
		System.out.println("Welcome to Soundary Paradice");
		System.out.println("*********************");
		System.out.println("DISHES");
		System.out.println("*********************");
		System.out.println("1.Dosa(50rs)");
		String dish1 = "Dosa";
		int dish1cost = 50;
		System.out.println("2.Idly(70rs)");
		String dish2 = "Idly";
		int dish2cost = 70;
		System.out.println("3.Puri(50rs)");
		String dish3 = "Puri";
		int dish3cost = 50;
		System.out.println("4.South Meals(100rs)");
		String dish4 = "South Meals";
		int dish4cost = 100;
		System.out.println("4.South Meals(100rs)");
		String dish5 = "North Meals";
		int dish5cost = 120;
		int disselc = sc.nextInt();
		switch (disselc) {
		case 1: {
			System.out.println("Your dish" + dish1 + "is order");
			System.out.println("Pay the amount of" + dish1cost + "rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 2: {
			System.out.println("Your dish " + dish2 + " is order");
			System.out.println("Pay the amount of" + dish2cost + "rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 3: {
			System.out.println("Your dish " + dish3 + " is order");
			System.out.println("Pay the amount of " + dish3cost + " rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 4: {
			System.out.println("Your dish " + dish4 + " is ordered");
			System.out.println("Pay the amount of " + dish4cost + " rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		case 5: {
			System.out.println("Your dish" + dish5 + "is order");
			System.out.println("Pay the amount of " + dish5cost + " rs and enjoy it");
			System.out.println("ThankYou");
			break;
		}
		}
	}

	// ***************************************************************************************

	private static void createAccont() {
		System.out.println("***********WELCOME*************");
		System.out.println("1.Create Accont the account");
		System.out.println("*******************************");
		System.out.println("Enetr the name");
		name = sc.nextLine();
		System.out.println("Enetr the email");
		email = sc.nextLine();
		System.out.println("Enetr the number");
		number = sc.nextLong();
		System.out.println("Enetr the password");
		password = sc.next();
		System.out.println("You have sucessfully created account");

		System.out.println();
	}

}
