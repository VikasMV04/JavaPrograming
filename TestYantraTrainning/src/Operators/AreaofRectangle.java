package Operators;

import java.util.Scanner;

public class AreaofRectangle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the length");
	double len=sc.nextDouble();
	System.out.println("Enter the breadth");
	double breadth=sc.nextDouble();
	double res=len*breadth;
	System.out.println("Area of rectangle = "+res);
	System.out.println(len);
}
}
