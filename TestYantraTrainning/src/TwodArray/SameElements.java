package TwodArray;

public class SameElements {

	public static void main(String[] args) 
	{
		int arrd[][]= {{11,13,88},{12,56,88},{22,33,44}};
		int arrd1[][]= {{11,13,88},{112,56,88},{22,33,44}};
		boolean flag=true;
		for (int i = 0; i < arrd1.length; i++) 
		{
			for (int j = 0; j < arrd1[i].length; j++) 
			if(arrd[i][j]!=arrd1[i][j])
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Both 2d Arrays are same");
		else
			System.out.println("Both 2d Arrays are not same");
	}

}
