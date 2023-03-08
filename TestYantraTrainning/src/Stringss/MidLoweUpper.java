package Stringss;

import java.util.Scanner;

public class MidLoweUpper {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s = sc.next().toLowerCase();
		int mid=s.length()/2;
		String res="";
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			if (i <mid)
				res += (char) (c - 32);
			else
				res += c;
	}
		System.out.println(res);
	}
}
