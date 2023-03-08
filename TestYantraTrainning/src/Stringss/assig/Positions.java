package Stringss.assig;

import java.util.Scanner;

public class Positions {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s=sc.next();
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='a')
			{
				System.out.println(i+1);
				break;
			}
		}
		int no=s.length();
		while(no>0)
		{
			System.out.println(s);
			no--;
		}
	}

}
