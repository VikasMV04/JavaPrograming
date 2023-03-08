package Recursionpractice;

public class ProductOfNaturalNumber {

	public static void main(String[] args) 
	{
		int n=10;
		System.out.println(proofnn(n));
	}

	public static int proofnn(int n) 
	{
		if(n<=1)
			return n;
		else
			return n*proofnn(n-1);
	}

}
