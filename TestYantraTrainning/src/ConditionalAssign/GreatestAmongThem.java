package ConditionalAssign;

import java.util.Scanner;

public class GreatestAmongThem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int firstno=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int secondno=sc.nextInt();
		if(firstno>secondno)
			System.out.println(firstno+" is greater");
		else
			System.out.println(secondno+" is greater");
		
	}

}
