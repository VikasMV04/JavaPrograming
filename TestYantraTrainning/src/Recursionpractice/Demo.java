package Recursionpractice;

public class Demo {

	public static void main(String[] args) 
	{
		testYantra(5);

	}

	public static void testYantra(int i) 
	{
		if(i<1) return ;
		
		else {
			System.out.println("Welcome to test Yantra");
			testYantra(i-1);
		}
		
	}

}
