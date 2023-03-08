package Typecasting;

import java.util.Scanner;

public class ConvertingToAllDataTypes {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any decemal number");
			double data=sc.nextDouble();
			
			//"Converting from double to byte"
			byte by=(byte)data;
			
			//Converting from double to short
			short sh=(short)data;
			
			//Converting double to int
			int it=(int)data;
			
			//Converting from double to long
			long lo=(long)data;
			
			//Converting from double to float
			float f=(float)data;
			
			System.out.println(f);
			

	}

}
