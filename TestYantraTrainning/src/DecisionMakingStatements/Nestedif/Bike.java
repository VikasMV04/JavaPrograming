package DecisionMakingStatements.Nestedif;

import java.util.Scanner;

public class Bike {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the amount");
		int amt=sc.nextInt();
		System.out.println("Eneter the no of bikes want to buy");
		int qty=sc.nextInt();
		if(amt>60000)
		{
			if(qty==1)
			{
				System.out.println("Money is sufficient to buy");
			}
			else
				System.out.println("Money is not sufficient to buy");
		}
		else
		{
			System.out.println("Take loan from bank to buy");
		}
	}

}
