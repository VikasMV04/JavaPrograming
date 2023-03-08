package DecisionMakingStatements.esleifladder;

import java.util.Scanner;

public class CricketPlayerRuns {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the run scored");
		int run=sc.nextInt();
		if(run>1&&run<25)
		System.out.println("Bad Performence");
		else if(run>25&&run<50)
			System.out.println("Good Performence");
		else if(run>50&&run<80)
			System.out.println("Amazing Performence");
		
	}

}
