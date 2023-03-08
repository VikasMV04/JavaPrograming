package Stringss.assig;

public class CountCharacters2 {
	public static void main(String[] args) {
		String a = "hello";
		String visited = "";
		for (int i = 0; i < a.length(); i++) 
		{ 
			char ch=a.charAt(i);

			
				if (visited.indexOf(ch)==-1) 
				{
					int count = 1;
					for (int j2 = i + 1; j2 < a.length(); j2++) {

						if (a.charAt(i) == a.charAt(j2)) {
							count++;
						}
					}
					System.out.print(a.charAt(i) + "" + count + " ");
					visited+=ch;
				}
				
				
			}
		}
	}


