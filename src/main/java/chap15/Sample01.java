package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample01 {
	public static void main(String[] args) {
		String str = "123-4567-8901#";
		String exp1 = "^[0-9-#]*$";
		String exp2 = "^[\\d-#]*$";
		
		Pattern p1 = Pattern.compile(exp1);
		Pattern p2 = Pattern.compile(exp2);
		
		Matcher m1 = p1.matcher(str);
		Matcher m2 = p2.matcher(str);
		
		System.out.println(m1.find());//참인지 거짓인지
		System.out.println(m2.find());
	}
}
