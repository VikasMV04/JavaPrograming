package Stringss.Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.Write a java program to store a String variable in\r\n"
				+ "lowercase and print the data present in it in uppercase\"\n"
				+ "2.Write a java program to store a String variable,reverse \r\n" + "the String and print it\n"
				+ "3.Write a java program to store colors of rainbow.Print \r\n"
				+ "only the first character of all the colors.\n"
				+ "4Create a variable and take input from the user.Print \r\n" + "only part of the data.\n"
				+ "5.Create a variable and store data with space in the \r\n"
				+ "beginning.Print the data without the space.\n"
				+ "6.Create a java program to create two String variables\r\n"
				+ "read the input from the user and concatenate them \n"
				+ "7.Write a java program to store a String variable in\r\n"
				+ "uppercase and print the data present in it in lowercase\n"
				+ "8Write a program to create a String \"\"Test Yantra\"\" and seperate both \r\n" + "words\n."
				+ "9.Write a program to take a sentence input from user and split it about\r\n" + "space\n"
				+ "10.Create a string to store 3 cities seperated by ,\r\n" + "then aeperate those 3 cities name\n"
						+ "11.Take a char array and convert it to String and print it.");
		System.out.println("Eneter the Number");
		int no = sc.nextInt();

		switch (no) {
		case 1: {
			System.out.println("Eneter the String");
			String s = sc.next();
			System.out.println("LowerCase = " + s.toLowerCase());
		}
			break;

		case 2: {
			System.out.println("Eneter the String");
			String s = sc.next();
			String rev = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				char lc = s.charAt(i);
				rev += lc;
			}
			System.out.println(rev);

		}
			break;

		case 3: {
			String[] rainbowcol = { "red", "orange", "yello", "green", "blue", "violet", "indigo" };
			System.out.println(Arrays.toString(rainbowcol));
			String res = "";
			for (int i = 0; i < rainbowcol.length; i++) {
				res += rainbowcol[i].charAt(0);
			}
			System.out.println(res);
		}
			break;

		case 4: {
			System.out.println("Enetr Data");
			String s = sc.next();
			System.out.println("Enter the start index");
			int sta = sc.nextInt();
			System.out.println("Enetr the last index");
			int end = sc.nextInt();
			System.out.println(s.substring(sta, end + 1));
		}
			break;

		case 5: {
			System.out.println("Enetr Data");
			String s1 = sc.nextLine();
			String s = sc.nextLine();

			System.out.println(s.replaceAll(" ", ""));
		}
			break;

		case 6: {
			System.out.println("Enetr Data");
			String s1 = sc.next();
			String s = sc.next();

			System.out.println(s1.concat(s));
		}
			break;

		case 7: {
			System.out.println("Enetr String in UpperCase");
			String s1 = sc.next();
			System.out.println(s1.toLowerCase());
		}
			break;

		case 8: {
			System.out.println("Enetr String ");
			String s1 = "Test Yantra";
			String s2[] = s1.split(" ");
			for (String a : s2) {
				System.out.println(a);
			}
			System.out.println(Arrays.toString(s2));
		}
			break;

		case 9: {
			System.out.println("Enetr String ");
			String s1 = sc.nextLine();
			String s2[] = s1.split(" ");
			for (String a : s2) {
				System.out.println(a);
			}
			System.out.println(Arrays.toString(s2));

		}
			break;

		case 10: {

			String[] city = new String[3];
			System.out.println("Enetr 3 cities by seperatin comma ");

			String city1 = sc.next();
			city = city1.split(",");
			for (String a : city) {
				System.out.println(a);
			}
		}
			break;

		case 11: {

			char[] ch = {'v','i','k','a','s'};
				String a=new String(ch);
			System.out.println(a);
		}
			break;

		}

	}

}
