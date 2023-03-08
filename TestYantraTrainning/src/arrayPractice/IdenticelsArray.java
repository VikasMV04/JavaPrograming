package arrayPractice;
import java.util.Scanner;

public class IdenticelsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size=sc.nextInt();
		int a1[]=new int[size];
		System.out.println("Enetr the 1st array elements");
		for (int i = 0; i < a1.length; i++) 
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enetr the size of 2nd array");
		int size2=sc.nextInt();
		int a2[]=new int[size2];
		System.out.println("Enetr the 2nd array elements");
		for (int i = 0; i < a2.length; i++) 
		{
			a2[i]=sc.nextInt();
		}
		
		if(a1.length==a2.length)
		{
			boolean flag=true;
			for (int i = 0; i < a2.length; i++) 
			{
				if(a1[i]==a2[i])
				{
					
				}
				else
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
				System.out.println("Identicle");
			else
				System.out.println("Not Identicle");
		}else
		{
			System.out.println("Not Identicle ");
		}

	}

}
