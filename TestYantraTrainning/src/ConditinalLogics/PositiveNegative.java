package ConditinalLogics;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		String str =(num1>0?"positive":"negative");
				System.out.println(num1+ " is "+str );
	}

}
