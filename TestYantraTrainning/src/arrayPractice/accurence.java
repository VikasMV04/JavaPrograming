package arrayPractice;

import java.util.Scanner;

public class accurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enetr the numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enetr the number to search");
		int givenin = sc.nextInt();
		boolean flag = true;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (givenin == arr[i]) {
				count++;

				if (count == 2) {
					break;
				}
			}

			else
				flag = false;
		}
		if (flag)
			System.out.println("accured two times");
		else
			System.out.println("Not accured more then two times");

	}

}
