package Stringss;

import java.util.Scanner;

public class lastcharcters {

	public static void main(String[] args) {
		
		String city="Bangaalore";
		System.out.println(city.substring(city.length()-4));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String no=sc.next();
		System.out.println(no.replaceFirst(no.substring(4),"******"));
	}

}
