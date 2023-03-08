package ConditionalAssign;

import java.util.Scanner;

public class CompositeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the ranges");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) 
		{

			boolean flag = true;
			for (int j = 2; j < i / 2; j++) 
			{
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				sum = i + sum;
			}

		}
		System.out.println(sum);

	}

}
