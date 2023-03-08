package Stringss.assig;

import java.util.Scanner;

public class Lowwercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s=sc.next();
		int count=0;
		String ch="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				ch+=c;
			}else
			{
				ch+=(char)(c+32);
			}
		}
		System.out.println(ch);

	}

}
