package chap02;

public class Sample06 {
	public static void main(String[] args) {
		int a = 32767; // short 최대값
		short b = 40;
		
//		b = a; 에러남
		b = (short)a;
		System.out.println(b);
		
		int c = 32768999; // short 최대값+1
		b =(short)c; //명시적 형 변환
		System.out.println(b);//자료형의 범위 넘어가지 않도록 주의
	}
}
