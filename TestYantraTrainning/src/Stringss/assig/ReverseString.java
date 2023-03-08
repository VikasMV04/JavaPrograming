package Stringss.assig;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String cc = sc.next();
		String rev="";
		for (int i = cc.length()-1; i >=0; i--)
		{
			rev+=cc.charAt(i);
		}
		System.out.println(rev);
	}

}
