import java.util.Scanner;

public class VovelNumberConsonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch='g';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			System.out.println("Vowel");
		else if(ch>=0&&ch<=9)
			System.out.println("Number");
		else
			System.out.println("Consonent");
	}

}
