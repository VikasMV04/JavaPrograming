package Stringss.assig;

import java.util.Scanner;

public class UppercaseCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String s=sc.next();
		int uppercase=0;
		int loc=0;
		int spc=0;
		for (int i = 0; i < s.length(); i++) 
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z');
			else if(ch>='a'&&ch<='z') 
				loc++;
			else if(ch>='0'&&ch<='9');
			
			else 		
				spc++;
			
		}
		System.out.println(loc);
		System.out.println(spc);
	}

}
