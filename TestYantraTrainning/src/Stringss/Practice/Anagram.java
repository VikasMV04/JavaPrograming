package Stringss.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
	{
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		System.out.println("Enter String");
		String s2=sc.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean flag=anagram(c1,c2);
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("Not a Anagram");
	}

	private static boolean anagram(char[] c1, char[] c2) 
	{
		boolean flag=true;
		if(c1.length!=c2.length) 
		{
			return false;
		}
		for (int i = 0; i < c2.length; i++) 
		{
			if(c1[i]!=c2[i])
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

}
