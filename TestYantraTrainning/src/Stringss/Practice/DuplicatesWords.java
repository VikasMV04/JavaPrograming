package Stringss.Practice;

public class DuplicatesWords {

	public static void main(String[] args) 
	{
		String s="hello world hello world";
		String[] str =s.split(" ");
		String v[]=new String[str.length];
		String fre ="hello";
		for (int i = 0; i < str.length-1; i++) 
		{
			int count=1;
			boolean flag=isvisted(v,str[i]);
			if(flag)
			{
				for (int j = i+1; j < v.length; j++) 
				{
					if(str[i].equals(str[j]))
					{
						count++;
					}
				}
//			if(str[i].equals(fre))
				System.out.println(str[i]+" is repeted for "+count+"times");
				v[i]=str[i];
			}
		}
		System.out.println("*****************************");
		
		int count1 =1;
		for (int i = 0; i < str.length; i++) 
		{
			System.out.println( count1+++" Element = "+str[i].length());
		}
	}

	private static boolean isvisted(String[] v, String check) {
		for (int i = 0; i < v.length; i++) 
		{
			if(check.equals(v[i]))
				return false;
		}
		return true;
	}

}
