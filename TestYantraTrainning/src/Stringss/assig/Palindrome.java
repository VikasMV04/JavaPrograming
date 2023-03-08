package Stringss.assig;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String cc = sc.next();
		String rev = "";
		for (int i = cc.length() - 1; i >= 0; i--) {
			rev += cc.charAt(i);
		}

		boolean flag = true;
		for (int i = 0; i < cc.length(); i++) {
			if (cc.charAt(i) != rev.charAt(i)) {
				{
					flag = false;
					break;
				}
			}

		}
		if (flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not");

//		if(cc.equals(rev))
//		System.out.println("Palindrome");
//	else
//		System.out.println("Not");

	}
}
