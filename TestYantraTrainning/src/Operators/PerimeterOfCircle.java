package Operators;

import java.util.Scanner;

public class PerimeterOfCircle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the lenght");
	double radius=sc.nextDouble();
	double pi=3.14;
	double res=2*pi*radius;
	System.out.println("Perimetr of circle is = "+res);
}
}
