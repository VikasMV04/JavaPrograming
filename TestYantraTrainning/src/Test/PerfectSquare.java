package Test;

public class PerfectSquare {

	public static void main(String[] args) 
	{
	int no=6;
	int num=no;
	int sum=0;
	
	for (int i = 1; i <= no/2 ; i++) 
	{
		if(no%i==0)
			sum+=i;
	}
	
	if(sum==num)
		System.out.println("perfect number");
	else
		System.out.println("not");
			
	}

}
