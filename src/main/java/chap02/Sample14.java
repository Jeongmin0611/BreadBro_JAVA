package chap02;

public class Sample14 {
	
	public static void main(String[] args) {
		/* final 키워드 사용 용도
		 * 1. 변수
		 * 2. 메소드(final 사용할 경우 overide 안됨.)
		 * 3. 클래스(final 사용할 경우 상속 안됨.)
		 * */
		final float PI; //초기값을 정하지 않고 PI를 상수로 선언
		PI = 3.14f;		//최초 값을 선언한다. 이후 PI값을 변경하면 오류가 발생한다.
//		PI = 123;		//The final local variable PI may already have been assigne
	
//		final var PI2;//= 3.141592f
		int radius = 10;
		
		float area = radius * radius * PI;
		System.out.printf("원의 넓이 : %f", area);
	}
}
