package DecisionMakingStatements.switchh;

import java.util.Scanner;

public class SL {
		 Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of the shirt");
		int size= sc.nextInt();
		
		switch(size)
		{
		case 28:
		{
			System.out.println("go to samll size section");
			break;
		}
		case 32:
		{
			System.out.println("go to medium size section");
			break;
		}
		case 40:
		{
			System.out.println("go to big size section");
			break;
		}
		
		}
		
		
	}

}
