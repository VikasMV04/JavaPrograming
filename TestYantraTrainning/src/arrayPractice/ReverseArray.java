package arrayPractice;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{

     int []a= {10,20,30,40,100};
    int []b=new int[a.length];
//     int temp=0;
//     for(int i=a.length-1;i>=0;i--)
//     {
//    	 b[temp++]=a[i];
//    }
     for (int i = a.length-1; i >=0; i--) 
     {
		for (int j = 0; j < b.length; j++) 
		{
			b[j]=a[i];
			i--;
		}
	}
     for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
    System.out.println(Arrays.toString(b));
	}

}