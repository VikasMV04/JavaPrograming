package ConditionalAssign;

import java.util.Scanner;

public class SumOfPrimeNumberRange {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number");
		int no = sc.nextInt();

			boolean flag = false;
			for (int j = 2; j <=no / 2; j++) 
			{
				if (no % j == 0) 
				{
					flag = true;
					break;
				}
			}
			if (flag) 
			{
				System.out.println("Composite number");
			}
			else
				System.out.println("Not composite number");

		}
		
	

}
