package Patterns.Triangle.Second_Phase;

public class DecreasingTriangleNumbers {

	public static void main(String[] args) {
		for (int r = 1; r <=5 ; r++) 
		{
			int no=1;
			for (int c = r; c <=5; c++) 
			{
				System.out.print(no);
				no++;
				
			}
			System.out.println();
		}
		System.out.println("********************");
		//2nd  way
		for (int r = 5; r >0  ; r--) 
		{

			for (int c = 1; c <=r; c++) 
			{
				System.out.print(c);
				
			}
			System.out.println();
		}

	}

}
