package chap02;

import java.util.HashMap;
import java.util.Map;

public class Sample13 {
	public static void main(String[] args) {
		/* var 자바10 버전 이상부터 사용가능하고, 타입이 컴파일러에 의해서 결정된다.
		 * 소스상에서 자료형 추론을 "값" 기준으로 함, 값을 초기화 하지 않으면 에러남.
		 * 람다식에서 사용됨.
		 * */
//		var i =365; //int i = 365;
//		System.out.println(i);
//		var j = 55L;//long j = 55l;
//		Map<String, String> map = new HashMap<String, String>();
//		var map2 = new HashMap<String, String>();
//		System.out.println(map2.toString());
		//var name; //자료형을 추론할 때 리터럴(값을 초기화)이 없으면 추론할 수 없어서 에러가 발생
		var name = "나어때";
		var age = 28;
		var height = 183.7f;
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
	}
}
