package Methods;

public class ParameterizedMethods {

	public static void main(String[] args) 
	{
		
		System.out.println(add(20,50));
		System.out.println(add(45.8,20.3));
		System.out.println(add(50l,100l));
		System.out.println(add('a','b'));
//		System.out.println(add("Good","Mornning"));
		
	}

	private static int add(double d, double e) {
		// TODO Auto-generated method stub
		return (int)d+(int)e;
	}

}