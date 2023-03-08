package Stringss.Practice;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) 
	{
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		int count=1;
		for (int i = 0; i < s1.length()-1; i++) 
		{
			char space=s1.charAt(i);
			char ch1=s1.charAt(i+1);
			if(space==' '&&(ch1>=33&&ch1<=126))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
