package Methodsspractice;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) 
	{
		double per=percentage();
		
		if(per>90)
			System.out.println("Grade A");
		else if(per>80&&per<90)
			System.out.println("Grade B");
		else if(per>=60&&per<=80)
			System.out.println("Grade C");
		else
			System.out.println("Grade D");
	}
	
	public static double percentage()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the english marks");
		int s1=sc.nextInt();
		System.out.println("Enter the science marks");
		int s2=sc.nextInt();
		System.out.println("Enter the physice marks");
		int s3=sc.nextInt();
		System.out.println("Enter the computer Science marks");
		int s4=sc.nextInt();
		System.out.println("Enter the maths marks");
		int s5=sc.nextInt();
		
		double sum=(s1+s2+s3+s4+s5);
		
		double percent=((sum/500)*100);
		return percent;
		
	}

}
