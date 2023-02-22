package chap02;

public class Sample16 {
	/**
	 * 실행 메소드입니다.
	 * @param args 난수값
	 */
	public static void main(String[] args) {
		//int num = random.nextInt(3) + 1; //0~2(배열 index랑 같음.) -> 1~3
		int num = (int)(Math.random() * 3 + 1);
		System.out.printf("난수 : %d",num);
	}
	
	/**
	 * 코드 템플릿을 연습합니다.
	 * @param in 입력값
	 * @return 출력값
	 */
	public int getValue(int in) {
		return in;
	}
	

	/**
	 * 연습
	 * @param in 입력
	 * @return 출력
	 * @since 1.0
	 * 2023. 1. 31.
	 */
	public int getValue2(int in) {
		return in;
	}
}
