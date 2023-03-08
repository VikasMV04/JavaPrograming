package NumbersProbleum;

public class PerfectSquare {

	public static void main(String[] args) {

		boolean flag = false;

		int num =9;

		for (int i = 1; i <= num/2; i++) {
			if (i * i == num) {
				flag = true;
				break;
			} else {

			}
			
		}
		if (flag) {
			System.out.println("Perfect square");
		} else {
			System.out.println("not a perfect square");
		}

	}

}
