package Patterns.Triangle;

import java.util.Scanner;

public class decresingTriangle2nd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter the rows");
		int n = sc.nextInt();

		for (int r = 1; r <= n; r++) // rows
		{

			for (int c = 1; c <= n; c++)// coloums
			{
				if (r + c > n) {
					System.out.print("* ");

				} else
					System.out.print("  ");
			}
			System.out.println();

		}

	}

}
