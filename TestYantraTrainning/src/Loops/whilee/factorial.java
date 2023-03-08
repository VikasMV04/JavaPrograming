package Loops.whilee;

public class factorial {

	public static void main(String[] args) {
//		the product of all positive integers less than or equal 
//		to a given positive integer and denoted by that integer 
//		and an exclamation point
		
		int num=5;
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);

	}

}
