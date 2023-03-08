package arrayPractice;

import java.util.Scanner;

public class NameArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		char arr[]=new char[4];
//		System.out.println(arr.length);
		System.out.println("Enetr your name characters");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length -1]);
		

	}

}
