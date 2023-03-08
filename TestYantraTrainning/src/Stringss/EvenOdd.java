package Stringss;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s = sc.next().toLowerCase();
		String cc = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i % 2 == 0)
				cc += (char) (c - 32);
			else
				cc += c;
		}
		System.out.println(cc);
	}

}
