package chap02;

public class Sample07 {

	public static void main(String[] args) {
		short a = 32767;//short 최대값
		int b =500000;
		b = a;//묵시적형변환(작은거 -> 큰거)
		System.out.println(b);
	}

}
