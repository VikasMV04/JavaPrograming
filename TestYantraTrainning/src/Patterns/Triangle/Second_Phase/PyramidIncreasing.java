package Patterns.Triangle.Second_Phase;

import java.util.Scanner;

public class PyramidIncreasing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int r = 1; r <=n; r++) 
		{
			for (int s = 1; s<=n-r; s++) 
			{
				System.out.print("  ");
			}
			
			for(int star=1;star<=2*r-1;star++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
