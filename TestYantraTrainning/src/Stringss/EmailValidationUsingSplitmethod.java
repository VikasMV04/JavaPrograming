package Stringss;
import java.util.Arrays;
import java.util.Scanner;
public class EmailValidationUsingSplitmethod {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Gmail");
			String s = sc.nextLine();
			String[] email = s.split("@");
			int d = email.length - 1;
			if (s.contains("@")&&(s.contains(" "))==false) {
				String un = email[0];
				try {
					String sl = email[d];
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Invalid");
				}
				if (un.length() > 0) {
					if (email[d].endsWith("gmail.com") || email[d].endsWith("gmail.in")
							|| email[d].endsWith("gmail.org")) {
						if (email[d].charAt(0) != '.')
							System.out.println("Valid");
						else
							System.out.println("Invalid domain name should not start with .");
					} else
						System.out.println("Invalid");
				} else
					System.out.println("Invalid");
			} else
				System.out.println("Invalid");
			System.out.println();
		}
	}
}
