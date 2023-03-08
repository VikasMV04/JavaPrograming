package Stringss;

import java.util.Arrays;
import java.util.Scanner;

public class SplittMethod {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the String");
		String s = sc.nextLine();
		System.out.println("Enetr the character to split");
		String ch=sc.next();
		String a[]=s.split(ch);
		System.out.println(Arrays.toString(a));
	}

}
