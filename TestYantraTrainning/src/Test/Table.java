package Test;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		System.out.println("Enetr the number");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
			for(int i=1;i<=10;i++)
			{
				int res=n*i;
				System.out.println(n+"*"+i+"="+res);
			}
			System.out.println();
		}

	}


