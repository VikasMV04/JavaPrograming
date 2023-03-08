package Stringss.Practice;

import java.util.Scanner;

public class LettersSeperatedByComma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s=sc.next();
		for (int i = 0; i < s.length(); i++) 
		{
			if(i==s.length()-1)
			{
				System.out.println(s.charAt(i));
			}else
			System.out.print(s.charAt(i)+",");
		}
		
	}

}
