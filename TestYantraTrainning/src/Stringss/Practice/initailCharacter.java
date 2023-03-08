package Stringss.Practice;

import java.util.Scanner;

public class initailCharacter {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine().toLowerCase();
//		String res="";

		if(s1.charAt(0)>='a'&&s1.charAt(0)<='z')
		{
			char ch=(char)(s1.charAt(0)-32);
			System.out.print(ch);
		}
//		for (int i = 0; i < s1.length(); i++) 
//		{
//			if(s1.charAt(i)==' '&&(s1.charAt(i+1)>='a'&&s1.charAt(i+1)<'z'))
//			{
//				char ch=s1.charAt(i);
//				char ch1=s1.charAt(i+1);
//				int x=ch1;
//				ch1=(char)(x-32);
//				res+=" "+ch1;
//				i++;
//			}else
//			{
//				res+=s1.charAt(i);
//			}
//			
//		}
//		System.out.println(res);
		
		char[] str=s1.toCharArray();
		for (int i = 0; i < str.length; i++) 
		{
			if(str[i]==' ')
			{
				str[i+1]=(char)(str[i+1]-32);
			}
			System.out.print(str[i]);
		}
		
	}

}
