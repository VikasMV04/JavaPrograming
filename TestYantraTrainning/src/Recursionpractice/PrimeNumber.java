package Recursionpractice;

public class PrimeNumber {

	static int n=2;
	static int i=2;
	static int half=n/2+1;
	public static void main(String[] args)
	{
		if(isPrime(n))
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime Number");
	}
	private static boolean isPrime(int n) 
	{
		if (i==half)
			return true;
		if(n%i==0)
		{
		return false;
		}
		i++;
		return isPrime(n);
	}
	

	

}
