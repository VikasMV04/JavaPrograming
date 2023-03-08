package Pyramids;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern4oddeven {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the rows");
		int n = sc.nextInt();
		int space=n-1;
		int print=1;
		System.out.println("Eneter the Number");
		int no=sc.nextInt();
		switch(no) {
		case 1:{
			for (int r = 1; r <=n; r++) 
			{
				for (int s = 1; s<=space; s++) 
				{
					System.out.print("  ");
				}
				for(int start=1;start<=print;start++)
				{
					System.out.print(start%2+" ");
				}
				print+=2;
				space--;
				System.out.println();
			}
		}break;
		
		case 2:{
			
			for (int r = 1; r <=n; r++) 
			{
				for (int s = 1; s<=space; s++) 
				{
					System.out.print("  ");
				}
				int num=1;
				for(int k=1;k<=print;k++)
				{
					System.out.print(num+" ");
					if(k<print/2+1)
					{
						num++;
					}
					else
					{
						num--;
					}
				}
				print+=2;
				space--;
				System.out.println();
			}
		}
		}
		
		}
	}


