package DecisionMakingStatements.switchh;

import java.util.Scanner;

public class AirTicketBooking {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr your choice \n1.Businnes Class\n2.Economical class\n3.Luxury class");
		int selction=sc.nextInt();
		switch(selction)
		{
		case 1:{
			System.out.println("You have choosen Businnes Class");
			break;
		}
		case 2:{
			System.out.println("You have choosen Economical class");
			break;
		}
		case 3:{
			System.out.println("You have choosen Luxury class");
			break;
		}
		
		}
		

	}

}
