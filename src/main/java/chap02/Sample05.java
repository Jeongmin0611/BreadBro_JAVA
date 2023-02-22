package chap02;

public class Sample05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "안녕하세요";//21번 메모리 참조
		String str2 = "안녕하세요";//값이 같기 때문에 21번 메모리 참조
		//21번에 "안녕하세요" 문구는 내버려두고 31번에 "안녕히 계세요." 를 만들고 참조
		//str2가 21번을 그대로 쓰고 있으니까. 21번 메모리 기준에는 "안녕하세요"라는 문자열이 불변이다.
		//변수 1개에 메모리를 1개 참조하는게 아님.
		str1 = "안녕히 계세요."; //31번 메모리 참조
		System.out.println(str1 + " " + str2);
	}

}
