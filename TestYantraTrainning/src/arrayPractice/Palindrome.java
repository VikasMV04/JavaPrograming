package arrayPractice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a size");
		    int size=sc.nextInt();
		    int [] a=new int[size];
		    System.out.println("Enter the array elements");
		    for(int i=0;i<size;i++)
		    {
		    	a[i]=sc.nextInt();
		    }
		    for(int i=0;i<size;i++)
		    {
		    	int n=a[i];
		    	int copy=n;
		    	int rev=0;
		    	while(n>0)
		    	{
		    		rev=rev*10+n%10;
		    		n/=10;
		    	}
		    
		    	if(copy==rev)
		    	{
		    		System.out.println(copy+"is a pallindrome");
		    	}
		    	else
		    	{
		    		System.out.println(copy+"is not pallindrome");
		    	}
		    }
	}

}
