package Loops.whilee;

public class NoOfDigits {

	public static void main(String[] args) 
	{	
		boolean b=true;
		boolean a=!b;
		System.out.println(a);
		int num=123456;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("No of Digits = "+count);

	}

}
