package Operators;

public class ouptuts {

	public static void main(String[] args) {
//		 int x = 1, y = 2, z = 5; 
//		 System.out.println(x == 1 || x > y || x > z);

//		 Sop(x == y || y == 2 || z == 5)
//		  
//		 Sop(x == y || y == z || z == x) 
//		 
//		 int age=20;
//		 int df=age++;
//		 System.out.println(df);
//		 System.out.println(age);
		 
//		 int x=5,y=-10,z=-20;
//		 int n = x--+y--+z--;
//		 System.out.println(n);

		int x=5,y=2,exp=10;
		exp%=x+(x>6?++y:--y);
		System.out.println(exp);
		 
	}

}
