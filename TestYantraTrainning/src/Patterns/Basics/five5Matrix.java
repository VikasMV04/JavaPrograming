package Patterns.Basics;

public class five5Matrix {

	public static void main(String[] args) {
		for(int i =1;i<=5;i++)
		{
			for(int c=1;c<=5;c++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
		
		//******************************************
		System.out.println();
		
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		//******************************************
				System.out.println();
				
				
        for(int r=1;r<=5;r++)
        {
        	for(int c=1;c<=5;c++)
        	{
        		if(c%2==0)
        			System.out.print(0+" ");
        		else
        			System.out.print(1+" ");
        	}
        	System.out.println();
        }
				
      //******************************************
      		System.out.println();
      		
      		
      		int count =1;
      		for(int r=2;r<=5;r++)//row
      		{
      			for(int c=1;c<=5;c++)//column
      			{
      				
      				System.out.print(count+" ");//prints the number
      				count++;//keep tracks of number
      			}
      			System.out.println();
      		}
      		
	}

}
