package Stringss;

import java.util.Scanner;

public class VowelsConsonents {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		int vowels=0;
		int consonents=0;
		String cc = sc.nextLine();
		for (int i = 0; i < cc.length(); i++) 
		{
			char ch=cc.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}else
				consonents++;
		}
		System.out.println(vowels);
		
		

	}

}
