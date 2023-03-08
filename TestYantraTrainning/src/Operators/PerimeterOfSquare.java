package Operators;

import java.util.Scanner;

public class PerimeterOfSquare {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the side of square");
	double side=sc.nextDouble();
	double res=4*side;
	System.out.println("Perimetr of squre is = "+res);
}
}
