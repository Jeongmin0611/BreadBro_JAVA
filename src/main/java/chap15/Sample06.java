package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample06 {
	public static void main(String[] args) {
		// .com 과 .net로 된 이메일을 찾아서 출력하세요.
		String target = "sample@sample.com,test@test.co.kr,example@example.com"
				+ "school@school.net,apple@apple.org";
		
		String regex = "\\w+@\\w+(.com|.net)";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(target);
		
		while(m.find()) {			
			System.out.println(m.group());
		}
	}
}
