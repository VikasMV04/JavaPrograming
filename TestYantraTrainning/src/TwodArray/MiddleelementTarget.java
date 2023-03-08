package TwodArray;

import java.util.Scanner;

public class MiddleelementTarget {

	public static void main(String[] args) {
		
			int[][] arr= {{1,1,3},{1,1,6},{1,1,1}};
			int[][] ar1= {{1,1,1},{1,1,6},{1,1,1}};
//			int[][] arr = userinput();
//			int[][] ar1 = userinput();
			int[][] mulres=new int[arr.length][arr.length];
			dispaly(arr);
			System.out.println("*******************");
			
			for (int i = 0; i < mulres.length; i++) 
			{
				for (int j = 0; j < mulres[i].length; j++) 
				{
					if(i==j&&i+j==(arr.length/2)+1)
					System.out.print(arr[i][j]+" ");
					else
						System.out.print(0+" ");
				}
				System.out.println();
				
			}
			System.out.println("*******************");
			
			

		}

		private static void dispaly(int[][] arr) {
			for (int i = 0; i < arr.length; i++) 
			{
				for (int j = 0; j < arr[i].length; j++) 
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}

		private static int[][] userinput() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr the no of rows");
			int row = sc.nextInt();
			System.out.println("Enetr the no of columns");
			int col = sc.nextInt();
			int[][] arr = new int[row][col];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enetr the data for row " + (i + 1));
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}

			}
			return arr;
	}

}
