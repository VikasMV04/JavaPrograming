package Test;

public class Strong {

	public static void main(String[] args) {
		
		int no=147;
		int sum=0;
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			int ans=1;
			for (int i = 1; i <= rem; i++) 
			{
				ans=ans*i;
			}
			sum=sum+ans;
			no=no/10;
			
		}
		
		if(sum==copy)
		{
			System.out.println("Strong number");
		}
		else
			System.out.println("Not a strong number");
	}

}
