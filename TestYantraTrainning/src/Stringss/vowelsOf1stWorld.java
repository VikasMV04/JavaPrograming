package Stringss;

public class vowelsOf1stWorld {

	public static void main(String[] args) 
	{
		String s="ello bengalore have a nice day";
		int count=0;
		char ch1=s.charAt(0);
		if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u') count++;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				char ch=s.charAt(i+1);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

	
}