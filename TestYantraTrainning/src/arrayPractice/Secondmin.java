package arrayPractice;

public class Secondmin {
	static int min;
	static int secondmin;

	public static void main(String[] args) {
		int[] a1 = { 111, 11, 202, 2, 1111 };
//		if (a1[0] < a1[1]) 
//		{
//			min = a1[0];
//			secondmin = a1[1];
//		} else {
//			min = a1[1];
//			secondmin = a1[0];
//		}
		min=(a1[0] < a1[1] ? a1[0] :a1[1] );
		for (int i = 1; i < a1.length; i++) {
			if (a1[i] < min) {
				secondmin = min;
				min = a1[i];
			}
		}
	
		System.out.println("Second maximum value = " + secondmin);
	
	}
}
