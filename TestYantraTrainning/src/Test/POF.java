package Test;

import java.util.Scanner;

public class POF {

	public static void main(String[] args) {
		
		System.out.println("Enetr the number");
		Scanner sc = new Scanner(System.in);
			int no=sc.nextInt();
		int prod=1;
		for (int i = 1; i <= no/2; i++) 
		{
			if(no%i==0)
			{
				prod=prod*i;
			}
		}
		System.out.println(prod);

	}

}
