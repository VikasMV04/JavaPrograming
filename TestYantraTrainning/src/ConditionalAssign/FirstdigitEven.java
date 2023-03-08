package ConditionalAssign;

public class FirstdigitEven {

	public static void main(String[] args) {
		int num = 223;
		while (num > 9) {
			num=num/10;
		}
		
		if (num % 2 == 0) {
			System.out.println("Starting with Even Number");
		}
		else
			System.out.println("Not Starting with even number");
	}
}
