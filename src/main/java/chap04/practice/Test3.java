package chap04.practice;

public class Test3 {
	//	다음 소스코드만 보고 예측해서 실행된 값과 비교해보세요.
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int r1 = ++a + ++b;//11	21
		int r2 = a++ + b++;//11	21
		int r3 = b++ + --a;//22 11
		int r4 = --a + a--;//10	10
		int r5 = b+=++a;//23	9	
		
		System.out.println(r1);//32
		System.out.println(r2);//32
		System.out.println(r3);//11
		System.out.println(r4);//20
		System.out.println(r5);//32
		
	}
}
