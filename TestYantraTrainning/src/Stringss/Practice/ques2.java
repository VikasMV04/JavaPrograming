package Stringss.Practice;

import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
//		Create two String variables and initialize them 
//		taking input from user. Compare them using 
//		equals() method"

		Scanner sc = new Scanner(System.in);
		System.out.println("1.==\n2.EqulasMethod\n3.compareToMethod\n4.equlsIgnoreCaseMethod\n5.");
		System.out.println("Eneter the Number");
		int no = sc.nextInt();
		
		switch (no) {
		case 1: {
			
			System.out.println("Enetr two Strings");
			String s=sc.next();
			String s2=sc.next();
			System.out.println(s==s2);

		}
			break;

		case 2: {
			System.out.println("Enetr two Strings");
			String s = sc.next();
			String s2 = sc.next();
			System.out.println(s.equals(s2));

		}
			break;

		case 3: {
			System.out.println("Enetr two Strings");
			String s = sc.next();
			String s2 = sc.next();
			System.out.println(s.compareTo(s2));

		}
			break;

		case 4: {
			System.out.println("Enetr two Strings");
			String s = sc.next();
			String s2 = sc.next();
			System.out.println(s. equalsIgnoreCase(s2));

		}
			break;
			
			
		
		}
	}

}
