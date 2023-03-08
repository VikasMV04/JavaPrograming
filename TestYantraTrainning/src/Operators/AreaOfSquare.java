package Operators;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of square");
		double side=sc.nextDouble();
		double res=side*side;
		System.out.println("Area of squre is = "+res);
		
		
	}

}
