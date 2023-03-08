package DecisionMakingStatements.switchh;

import java.util.Scanner;

public class Subject {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Language Details \n1.Kannada\n2.English\n3.Sanskrit\nChose your language");
		int cho=sc.nextInt();
		switch(cho)
		{
		case 1:{
			System.out.println("you chose Kannada as your 1st language");
			break;
		}
		case 2:{
			System.out.println("you chose English as your 1st language");
			break;
		}
		case 3:{
			System.out.println("you chose Sanskrit as your 1st language");
			break;
		}
		default:{
			System.out.println("Enetr the option correctly");
		}
		}
		
		
	}

}
