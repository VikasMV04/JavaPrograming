package Methods;

import java.util.Scanner;

public class NonParameterizedMethod {
	static int a;
	static int b;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		
		System.out.println("****************");
		System.out.println("1.Addition\n2.Subraction\n3.Multiplication"
				+ "\n4.Division\n5.Modulus");
		System.out.println("Enter the option");
		int select=sc.nextInt();
		switch(select) 
		{
		case 1:{
			add();
		}break;
		
		case 2:{
			sub();
		}break;
		
		case 3:{
			mul();
		}break;
		
		case 4:{
			div();
		}break;
		
		case 5:{
			modulus();
		}break;
		
		case 6:{
			discount();
		}break;
		}
		
	}

	public static void discount() 
	{
		System.out.println("Eneter the Cost Price");
		a=sc.nextInt();
		System.out.println("Eneter the Final Price");
		b=sc.nextInt();
		double c=(b/a)*100;
		System.out.println(b);
		System.out.println("Discount you get= "+(c-100));
		
	}

	public static void modulus() {
		System.out.println("Eneter the 1st number");
		a=sc.nextInt();
		System.out.println("Eneter the 2nd number");
		b=sc.nextInt();
		System.out.println("Modulus of 2 numbers = "+(a%b));
	}

	public static void div() {
		System.out.println("Eneter the 1st number");
		a=sc.nextInt();
		System.out.println("Eneter the 2nd number");
		b=sc.nextInt();
		System.out.println("Division of 2 numbers = "+(a/b));
	}

	public static void mul() {
		System.out.println("Eneter the 1st number");
		a=sc.nextInt();
		System.out.println("Eneter the 2nd number");
		b=sc.nextInt();
		System.out.println("Multiplication of 2 numbers = "+(a*b));
		
	}

	public static void sub() {
		System.out.println("Eneter the 1st number");
		a=sc.nextInt();
		System.out.println("Eneter the 2nd number");
		b=sc.nextInt();
		System.out.println("Subraction of 2 numbers = "+(a-b));
		
	}

	public static void add() {
		System.out.println("Eneter the 1st number");
		a=sc.nextInt();
		System.out.println("Eneter the 2nd number");
		b=sc.nextInt();
		System.out.println("Addition of 2 numbers = "+(a+b));
		
	}

}
