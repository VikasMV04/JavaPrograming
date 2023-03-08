package Recursionpractice;

public class NaturalNnumbers {

	public static void main(String[] args) {
		
		int n=10;
		System.out.println(natuNumber(n));
	}

	public static int natuNumber(int n) 
	{
		if(n<=1)
			return n;
		else
			return n+natuNumber(n-1);
	}

}
