package Loops.whilee;

import java.util.Scanner;

public class tenEvennumbers {

	public static void main(String[] args) {
		
		int num = 2;
		int count=1;
		while (count <= 10) 
		{
			if (num % 2 == 0) {
				System.out.println(num);
				count++;
			}
			num++;
			
		}

	}

}
