package ConditinalLogics;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	boolean res =(num1%2==0?true:false);
	System.out.println(res);
}
}
