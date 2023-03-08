package Stringss.assig;


public class GmailValidation {

	public static void main(String[] args) 
	{
	
		String s= "vikas@gmail.com";
		boolean flag=true;
		int count=0;
		if(s.endsWith(".com")||s.endsWith(".in")||s.endsWith(".org"))
		{
			if(s.contains("@"))
			{
				for (int i = 0; i < s.indexOf('@'); i++) 
				{
					char ch=s.charAt(i);
					
					if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'||ch=='.')
					{
						count++;
						continue;
					}else
					{
						flag =false;
						System.out.println("not Valid");
						break;
					}
					
				}
				if(flag&&count>0)
					System.out.println("Valid");
				else
					System.out.println("NotValid");
			}else
				System.out.println("Not Valid");
		}else
			System.out.println("not valid");
		
		
	}

}
