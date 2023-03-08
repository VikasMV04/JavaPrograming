package ConditionalAssign;

import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		
	
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the year");
	int year=Sc.nextInt();
	
	System.out.println("enter the salary");
	int sal=Sc.nextInt();
	
	int bonus=5;
	if(year>5){
		bonus=sal*bonus/100;
	
		System.out.println( bonus  );
		
		
	}
	else System.out.println("your not eligible for bonus");
	
		
	


	
}


}
