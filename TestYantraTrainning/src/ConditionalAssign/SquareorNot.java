package ConditionalAssign;

import java.util.Scanner;

public class SquareorNot {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.println("enter the length of rec");
		int l = Sc.nextInt();
		System.out.println("enter the breadth of rec");
		int b = Sc.nextInt();

		if (l == b) {
			System.out.println("it is rectangle");

		} else {
			System.out.println("it is not a square");
		}

	}
}
