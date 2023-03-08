package Typecasting;

public class Widneing {

	public static void main(String[] args) {
		//Widening
		System.out.println("byte to short");
		byte a=10;
		short b=a;
		System.out.println(b);
		
//  	short to int
		System.out.println("short to int");
		short one=10;
		int sam=one;
		System.out.println(sam);
		
		//int to long
		System.out.println("int to long");
		int rick =100;
		long ram=rick;
		System.out.println(ram);
		
		System.out.println("(Explicitly)int to long");
		int rick1 =100;
		long ram1=(long)rick1;
		System.out.println(ram1);
		
		//long to double
		System.out.println("long to double");
		long tit=100000;
		double lit=tit;
		System.out.println(lit);
		
		//char to int
		System.out.println("char to int");
		char ch='a';
		int res=ch;
		System.out.println(res);
		
		

	}

}
