package Stringss;

import java.util.Scanner;

public class FirstAndLastCharacter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s=sc.next();
		System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));
	}

}
