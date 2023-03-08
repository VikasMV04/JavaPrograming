package NumbersProbleum;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int sum = 0;
		
	System.out.println("Enter which way");
	int way=sc.nextInt();
		switch(way)
		{
		case 1:{
			while (true) 
			{
				sum=0;
				do 
				{
					int rem = no % 10;
					sum = sum + (rem * rem);
					no /= 10;
				}while (no!=0);
				no = sum;
				if (no == 1) {
					System.out.println("Happy Number");
					break;
				} else if (no == 4) {
					System.out.println("Sad number");
					break;
				}
			
			}
		}break;
		
		
	}
}
