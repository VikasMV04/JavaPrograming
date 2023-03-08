import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		while(true) {
		Pattern pattern=Pattern.compile(".+.@gamil.com");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Matcher matcher=pattern.matcher(str);
		System.out.println(matcher.matches());
	}
	}
}
