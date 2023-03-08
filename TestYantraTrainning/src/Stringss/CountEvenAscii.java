package Stringss;

public class CountEvenAscii {

	public static void main(String[] args) 
	{
		String s="Mangalore";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
			int x=s.charAt(i);
//			System.out.print(x+" ");
			if(x%2==0)
			{
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}

}
