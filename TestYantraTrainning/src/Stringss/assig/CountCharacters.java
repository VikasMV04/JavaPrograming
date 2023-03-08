package Stringss.assig;

public class CountCharacters {
	public static void main(String[] args) {
		String a = "hiiloojiieei";
		for (int i = 0; i < a.length(); i++) 
		{
			int count = 1;
			boolean flag = true;
			
			for (int j2 = 0; j2 < i; j2++) 
			{
				if (a.charAt(j2) == a.charAt(i)) {
					flag = false;
					break;
				}
			}
			if(flag==true)
			{
			for (int j = i + 1; j < a.length(); j++) 
			{
					if (a.charAt(i) == a.charAt(j)) 
					{
						count++;
					}
				
			}
			System.out.print(a.charAt(i) + "" + count + " ");
			}
			
			

		}
	}

	
	

}
