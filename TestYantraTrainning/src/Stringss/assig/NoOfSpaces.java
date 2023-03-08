package Stringss.assig;

import java.util.Scanner;

public class NoOfSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s=sc.next();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
	}

}
