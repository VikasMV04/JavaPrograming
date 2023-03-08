package DecisionMakingStatements;

import java.util.Scanner;

public class threenumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int no1=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int no2=sc.nextInt();
		System.out.println("Enter the 3rd number");
		int no3=sc.nextInt();
		
		int res=no1+no2+no3;
		if(res>50)
			System.out.println("The Sum is greater then 50");
		else
			System.out.println("The sum is lesser then 50");
		
	}

}
