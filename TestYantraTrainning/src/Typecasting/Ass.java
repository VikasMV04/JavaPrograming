package Typecasting;

public class Ass {
public static void main(String[] args) {
	System.out.println("1st");
	double val=10.325;
	int res =(int)val;
	System.out.println(res);
	
	System.out.println("2nd");
	int str=68;
	char ch=(char)str;
	System.out.println(ch);
	
	System.out.println("3rd");
	char value ='D';
	int result=value;
	System.out.println("result");
	
	System.out.println("4th");
	int vicky=500;
	double cop =13.5;
	int count=(int)(vicky/cop);
	System.out.println("Vicky can buy "+count+" Chocolates");
	
}
}
