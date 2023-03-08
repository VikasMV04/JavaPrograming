package Patterns.Triangle;

public class decresingTriangle1s {

	public static void main(String[] args) {
		
		for (int r = 5; r > 0; r--) 
		{
			{
				for (int c = 5; c >0; c--) 
				{
					if(c>=r)
						System.out.print(c+" ");
				}
				System.out.println();
					
				}
			}
		}

}
