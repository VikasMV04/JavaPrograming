package Stringss.Practice;

import java.util.Scanner;

public class OccurenceOfcharacters {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter character to search");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {

			if (ch == s1.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
