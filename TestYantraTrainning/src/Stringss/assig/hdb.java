package Stringss.assig;

public class hdb {
	public static void main(String[] args) {
	String s="hello";
	String visited = "";
	for (int i = 0; i < s.length(); i++) 
	{
		char ch = s.charAt(i);
		int count = 1;
		if(visited.indexOf(ch)==-1)
		{
		
		for (int j2 =0; j2 < s.length(); j2++) 
		{	
			if(s.charAt(i) == s.charAt(j2))
			{
				count++;
			}
		}
			
			System.out.print(s.charAt(i)+""+count+" ");
			visited+=ch;
	}
	}
	}
}
