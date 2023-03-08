package Methodsspractice;

import java.util.Scanner;

public class Area_of_circle 
{
	 static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
//		areaOfCircle();
		circumferenceOfCircle();
		
	}

	private static void circumferenceOfCircle() {
		System.out.println("Circumference of Circle");
		System.out.println("Eneter the radius of cirtcle");
		int r= sc.nextInt();
		double pi=3.14;
		double ans=2*pi*r;
		System.out.println("Area = "+ans);
		circumferenceOfCircle();
	}

	public static void areaOfCircle() 
	{
System.out.println("Area of Circle");
		System.out.println("Eneter the radius of cirtcle");
		int r= sc.nextInt();
		double pi=3.14;
		double ans=pi*(r*r);
		System.out.println("Area = "+ans);
	}

}
