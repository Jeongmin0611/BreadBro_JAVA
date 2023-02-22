package chap02;

public class Sample01 {

	public static void main(String[] args) {
		char chr = 'A';
		System.out.println("char : " + chr); //문자
		//아스키코드에 대응하는 숫자로 출력
		System.out.println("Incoding : " + (int)chr);//명시적 형변환 
		System.out.println("Decoding : " + (char)66);
	}

}
