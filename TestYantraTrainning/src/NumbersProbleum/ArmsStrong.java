package NumbersProbleum;

public class ArmsStrong {

	public static void main(String[] args) {
		int num=153;
		int copy=num;
		int copy2=num;
		int power = 0;
		
		
		while(num!=0)
		{
			num=num/10;
			power++;
		}
		int sum=0;
		while(copy!=0)
		{
			int rem=copy%10;
			sum=sum+power(power,rem);
			copy/=10;
		}
	
		if(copy2==sum)
		{
			System.out.println("ArmStrong Number");
		}
		else
			System.out.println("not");

	}

	private static int power(int power, int rem) {
		int ans=1;
		for(int i=1;i<=power;i++)
		{
			ans=rem*ans;	
		}
		return ans;
	}

}
