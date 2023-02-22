package chap07;

public class Sample07 {
	public static void main(String[] args) {
		/*
		 * 향상된 case문(java14 버전에서 정상 릴리즈)
		 * */
		int in = 10;
		
		switch(in) {
			case 1, 3, 5, 9 :
				System.out.println("홀수입니다.");
				break;
			case 2, 4, 6, 8, 10 :
				System.out.println("짝수입니다.");
				break;
			default: 
				System.out.println("1부터 10까지의 수가 아닙니다.");
		}
	}
}
