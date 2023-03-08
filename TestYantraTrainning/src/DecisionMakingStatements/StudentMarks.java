package DecisionMakingStatements;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the student name");
//		String name=sc.nextLine();
//		System.out.println("enter the roll  number");
//		int roolno=sc.nextInt();
		System.out.println("Enter the marks of English");
		int eng =sc.nextInt();
		System.out.println("Enter the marks of java");
		int java=sc.nextInt();
		System.out.println("Enter the marks of kannada");
		int kan=sc.nextInt();
		System.out.println("Enter the marks of maths");
		int math=sc.nextInt();
		System.out.println("Enter the marks of science");
		int sci=sc.nextInt();
		
		double totalmarks=(eng+java+kan+math+sci);
		double per=totalmarks/500*100;
		System.out.println("percentage = "+per+"%");
		
		if(per>=90&&per<=100)
			System.out.println("Grade A");
		else if(per>=80&&per<=90)
			System.out.println("Grade B");
		else if(per>=70&&per<80)
			System.out.println("Grade B+");
		else
			System.out.println("Grade C");
	}

}
