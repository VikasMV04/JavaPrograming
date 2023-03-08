package DecisionMakingStatements.switchh;

import java.util.Scanner;

public class MiniCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose the operation to perform\n1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
		int selection=sc.nextInt();
		switch(selection)
		{
		case 1:{
			System.out.println("*****ADDITION*********");
			System.out.println("Enetr the no of digits");
			int count=sc.nextInt();
			int sum=0;
			int st=1;
			while(count>0)
			{
			System.out.println("Enter the"+ st +" value");
			sum=sum+sc.nextInt();
			count--;
			st++;
			}
			System.out.println("Sum of values is "+sum);
			break;
		}
		case 2:{
			System.out.println("*****sUBTRACTION*********");
			System.out.println("Enetr the 1st digit");
			int num1=sc.nextInt();
			System.out.println("Enetr the 2st digit");
			int num2=sc.nextInt();
			int sub=num1-num2;
			System.out.println("Answer = "+sub);
			break;
		}
		case 3:{
			System.out.println("*****Multiplication*********");
			System.out.println("Enetr the no of expression");
			int count=sc.nextInt();
			int mul=1;
			int st=1;
			while(count>0)
			{
			System.out.println("Enter the "+ st +" value");
			mul=mul*sc.nextInt();
			count--;
			st++;
			}
			System.out.println("Answer = "+mul);
			break;
		}
		case 4:{
			System.out.println("******DIVISION*********");
			System.out.println("Enetr the numerator");
			int numerator=sc.nextInt();
			System.out.println("Enetr the denominator");
			int denominator=sc.nextInt();
			int res=numerator/denominator;
			System.out.println("Anser = res");
			break;
		}
		}

	}

}
