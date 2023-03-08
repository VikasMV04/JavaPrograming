package Pyramids;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the rows");
		int n = sc.nextInt();
		
		for (int r = 1; r <=n; r++) 
		{
			for (int s = 1; s<=n-r; s++) 
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
				if(k==1||r==n||k==2*r-1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
