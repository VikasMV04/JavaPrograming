package Test.Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int find=4089;
		boolean flag=false;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==find)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("Element found");
		else
			System.out.println("Not found");
	}

}
