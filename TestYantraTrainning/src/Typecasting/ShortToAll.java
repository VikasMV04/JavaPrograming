package Typecasting;

public class ShortToAll {

	public static void main(String[] args) {
		
		short data=120;
		
		char ch=(char)data;//has to  be done explicitly 
		byte b1=(byte)data;
		
		int a3=data;
		long a4=data;
		float a5=data;
		double a6=data;
		
		
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(ch);
		System.out.println(b1);
			
	}

}
