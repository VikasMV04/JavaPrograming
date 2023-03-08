package ConditionalAssign;

import java.util.Scanner;

public class AgeOfThreePeo {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		 
		System.out.println("enter the age");
		
		int age1=Sc.nextInt();
		
		System.out.println("enter the age ");
		int age2=Sc.nextInt();
		
		System.out.println("enter the age");
		int age3=Sc.nextInt();
		
		if(age1>age2 && age2>age3)
		{
			System.out.println( age1 +  "is yongest");
		}
		else if(age2>age3)
		{
			System.out.println( age2  +  " is oldest");
		}
		else
		{
			System.out.println( age3  +  "is youngest");
		}
	}



	}


