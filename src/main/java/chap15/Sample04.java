package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample04 {
	public static void main(String[] args) {
		// .com으로 된 이메일을 배열로 찾으세요.
		String target = "sample@sample.com,test@test.co.kr,example@example.net"
				+ "school@school.org,apple@apple@apple.com";
		
		//문자열@문자열.com
		String regex = "([\\w]+@[\\w]+.com)";
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m = p1.matcher(target);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
