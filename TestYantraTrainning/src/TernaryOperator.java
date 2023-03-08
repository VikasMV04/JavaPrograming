
public class TernaryOperator {

	public static void main(String[] args) {
		int a=1900;
		int b=100;
		int c=499;
		int d=40;
 //                             C                    C               C
		System.out.println((a>b&&a>c&&a>d) ? a : (b>c&&b>d) ?  b : (c>d)?c:d);
//											 T		F		   T
		
		int x=100;
	    float y=200f;
	    float z=x/y*100;
		System.out.println(z);
		
	}																	

}
