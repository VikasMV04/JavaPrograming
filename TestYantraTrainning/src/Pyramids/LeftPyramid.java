package Pyramids;

import java.util.Iterator;
import java.util.Scanner;

public class LeftPyramid 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the rows(Odd number only)");
		int n=sc.nextInt();
		int half=n/2+1;
		int star=1;
		for (int r = 1; r <=n ; r++) 
		{
			for (int c = 1; c <=star; c++) 
			{
				System.out.print("* ");
			}
			if(r<half) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
		}

	}

}
