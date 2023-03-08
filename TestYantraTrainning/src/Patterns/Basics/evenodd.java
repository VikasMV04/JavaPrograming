package Patterns.Basics;

public class evenodd {

	public static void main(String[] args) {
		
		System.out.println("*");
		
		//***********************************************
		for(int i=1;i<=5;i++)
		{
			System.out.print("4");
		}
		
		//***********************************************
		System.out.println();
		
		
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
				System.out.print("0");
			else
				System.out.print("1");
		}
	}

}
