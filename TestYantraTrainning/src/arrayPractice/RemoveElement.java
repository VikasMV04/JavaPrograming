package arrayPractice;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,44,5,55};
		int b[]= new int[a.length-1];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter the value to be deleted");
		int no=sc.nextInt();
		int ind=0;
////		for (int i = 0; i < a.length; i++) 
////		{
////			if(a[i]!=no)
////			{
////				b[ind++]=a[i];
////			}
////				
////			
////		}
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i <a.length; i++) 
		{
			if(a[i]==no)
			{
			}
			else
			a[ind++]=a[i];		
		}
		a[a.length-1]=0;
		System.out.println(Arrays.toString(a));


	}

}
