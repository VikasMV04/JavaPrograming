package Stringss.assig;

import java.util.Scanner;

public class EvenIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the String");
		String cc = sc.next();
		for (int i = 0; i < cc.length();i++ ) 
		{
			if(i%2==0)
			{
				if(cc.length()-1==i||cc.length()-2==i)
				System.out.print(cc.charAt(i));
				else{
				System.out.print(cc.charAt(i)+",");
			}
			}
		
}

}
}