package Methodsspractice;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	average();
		}
	
	public static void average()
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
		
		double avg=(s1+s2+s3+s4+s5)/5;
		
//		double percent=((sum/500)*100);
		System.out.println("average = "+ avg);
		return  ;
	}

}
