package chap15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample05 {
	public static void main(String[] args) {
		String url = "https://docs.oracles.com/en/java/javase.html";///16/docs/api/java.base/java/lang/String.html";
		
		String regex = "\\w+.html$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(url);
		
		while(m.find()) {			
			System.out.println(m.group());
		}
	}
}
