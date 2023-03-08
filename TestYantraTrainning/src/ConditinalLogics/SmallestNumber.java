package ConditinalLogics;

public class SmallestNumber {

	public static void main(String[] args) {
		int  num1=100;
		int num2=200;
//		if(num1<num2){
//			System.out.println(num1+" is smaller");
//		}
//		else
//			System.out.println(num2 +" is smaller");
		
		int res=(num1<num2?num1:num2);
		System.out.println(res+ " is smaller");

	}

}
