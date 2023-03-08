package DecisionMakingStatements;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st side of triangle");
		int firstside=sc.nextInt();
		System.out.println("enter the 2st side of triangle");
		int secondside=sc.nextInt();
		System.out.println("enter the 3st side of triangle");
		int thirdside=sc.nextInt();
		
			if((firstside==secondside)&&(secondside==thirdside))
			System.out.println("Equilateral triangle");
			else if((firstside==secondside)||(secondside==thirdside)||(thirdside==firstside))
				System.out.println("Isoceles triangle");
			else if((firstside==90)||secondside==90||thirdside==90)
				System.out.println("Right Angle triangle");
			else
				System.out.println("Scalen Triangle");
	}

}
