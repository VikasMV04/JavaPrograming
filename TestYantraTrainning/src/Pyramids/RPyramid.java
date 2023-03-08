package Pyramids;


import java.util.Scanner;

public class RPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows(Odd number only)");
		int n = sc.nextInt();
		int half = n / 2 + 1;
		
		int space = half - 1;
		int star = 1;

		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= space; c++) 
			{
				System.out.print(" ");
			}

			for (int k = 1; k <= star; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
			if (r < half) 
			{
				space--;
				star++;
			}
			else 
			{
				space++;
				star--;
			}
			
			
		}
	}
}
