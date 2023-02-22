package chap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample14 {
	public static void main(String[] args) {
		//배열에서 데이터 추가하는 방법 1
		var student1 = new String[7];
		student1[0] = "스노우 화이트";
		student1[1] = "멀린";
		student1[2] = "레지나";
		student1[3] = "애버러지";
		student1[4] = "잭";
		student1[5] = "아더";
		student1[6] = "한스";
		
		//배열에서 데이터 추가하는 방법 2
		var students2 = new String[] {
				"스노우 화이트", "멀린", "레지나", "애버러지", "잭", "아더", "한스"
		};
		
		//List에서 데이터 추가하는 방법 1
		List<String> students3 = new ArrayList<String>();
		students3.add("스노우 화이트");
		
		
		//List에서 데이터 추가하는 방법 2
		List<String> students4 = Arrays.asList("스노우 화이트", "멀린", "레지나", "애버러지", "잭", "아더", "한스");
		
		System.out.println(students4.toString());
	}
}
