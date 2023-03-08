package Patterns.Triangle;

public class Series1_4th {

	public static void main(String[] args) {
		
		int count=1;
		for (int r = 1; r <=5; r++)//rows
		{
			{
				for (int c = 1; c <=r; c++)//colums
				{
					
						System.out.print(count+" ");
					    count++;
					
				}
				System.out.println();
					
				}
			}
		}

}
