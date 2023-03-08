package Patterns.Triangle;

public class Series2_6thone {

	public static void main(String[] args) {

		for (int r = 1; r <= 5; r++) //rows
		{
			{
				for (int c = 1; c <= r; c++) //columns
				{

					if (r % 2 == 0) //check row is even or odd
					System.out.print(r + " ");//if row is even print row number
					else
					System.out.print(5 + " ");//if row is odd print 5

				}
				System.out.println();//jump to next row

			}
		}
	}

}
