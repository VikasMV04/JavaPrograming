package Recursionpractice;

	
public class EvenOdd {
	static int range1=10;
	static int range2=20;
	public static void main(String[] args) 
	{
			isEven(range1,range2);
			
	}  
	private static void isEven(int range1,int range2) 
	{
		if(range1>range2)
		return;
		else
			if(range1%2==0)
			{
				System.out.println(range1+" is even");
			}
			range1++;
			isEven(range1,range2); 
			
	}

}
