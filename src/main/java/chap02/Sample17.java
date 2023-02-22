package chap02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Sample17 {
	public static void main(String[] args) {
		/*
		 * 예약어/변수명
		 * 변수명 첫번째 자리는 (_, $, 문자), 두번째 자리는 (_, $, 문자, 숫자)
		 * _ 는 jdk 1.8 이후로는 변수명으로 사용이 안됨.
		 * */
//		String _ = "underscore";//'_' is a keyword from source level 9 onwards, cannot be used as identifier 
//		System.out.println(_);
//		test("underscore");
		Function<String, String> f = a -> a;
		Function<String, String> g = a_ ->a_;
		
		/*
		 * 표기법
		   Internet of thing
		   Text box
		   find keyword
		 
		   1. 카멜 표기법(Camel Case)
		   internetOfThing
		   textBox
		   findKeyword
		   
		   2. 파스칼 표기법(Pascal Case)
		   InternetOfThing
		   TextBox
		   FindKeyword
		   
		   3. 스네이크 표기법(Snake Case)
		   internet_of_thing
		   text_box
		   find_keyword
		   
		   4. 케밥 표기법(Kebab Case) 프로그래밍에서 사용하는 건 아님.
		   internet-of-thing
		   text-box
		   find-keyword
		  * 
		 */
		int Internet = 10;
		int of = 1;
		int thing = 2;
		int a = Internet-of-thing;
		String string = "asdf";
		Map mapData = new HashMap<>();
		
	}

//	public static void test(String _) {
//
//	}
	
	
}
