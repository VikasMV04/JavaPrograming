package Stringss;

public class Methods {

	public static void main(String[] args) 
	{
		String s="Sita Ramama";
		System.out.println(s.length());
		System.out.println("**********************");
		System.out.println(s.toUpperCase());
		System.out.println("**********************");
		System.out.println(s.toLowerCase());
		System.out.println("**********************");
		System.out.println(s.startsWith("Sta"));
		System.out.println("**********************");
		System.out.println(s.startsWith("Sita"));
		System.out.println("**********************");
		System.out.println(s.endsWith("amma"));
		System.out.println("**********************");
		System.out.println(s.contains("Ram"));
		System.out.println("**********************");
		System.out.println(s.concat(" Movie is awesome"));
		System.out.println("**********************");
		System.out.println(s.charAt(0));
		System.out.println("**********************");
		System.out.println(s.indexOf('R'));
		System.out.println("**********************");
		System.out.println(s.substring(3));
		System.out.println("**********************");
		System.out.println(s.substring(0,4));
		System.out.println("**********************");
		System.out.println();
	}

}
