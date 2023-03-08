package TwodArray;

public class Transpose {

	public static void main(String[] args)
	{
		int arr[][]= {{11,13,88,56,34},{45,12,56,34,88},{22,33,44,88,99},{22,33,44,88,99},{22,33,44,88,99}};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int arr2[][]=new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr2[j][i]=arr[i][j];
			}
		}
		System.out.println("*****************************");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
