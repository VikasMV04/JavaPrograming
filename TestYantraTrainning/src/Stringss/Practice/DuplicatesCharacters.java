package Stringss.Practice;

import java.util.Scanner;

public class DuplicatesCharacters {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String vis = "";

		System.out.print("Duplicates Characters are - ");
		for (int i = 0; i < s1.length() - 1; i++) {
			char ch = s1.charAt(i);

			if (vis.indexOf(ch) == -1) 
			{
				int count = 0;
				for (int j = i + 1; j < s1.length(); j++) 
				{
					if (ch == s1.charAt(j) && ch != ' ') 
					{
						count++;
					}
				}
				if (count >= 1) {
					System.out.print(ch + " ");
				}
			}
			vis += ch;
		}
	}
}
