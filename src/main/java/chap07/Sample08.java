package chap07;

public class Sample08 {
	public static void main(String[] args) {
		/*
		 * java12 버전 은 preview, 14버전에서 정식릴리즈
		 * */
		int in = 71;
		
		switch(in) {
			case 1, 3, 5, 7, 9 -> System.out.println("홀수입니다.");// 한줄은 -> (break 없어도 됨.)
			case 2, 4, 6, 8, 10 -> System.out.println("짝수입니다.");
			default  -> {//여러 줄은 {}
				System.out.println("1부터 10까지의 수가 아닙니다.");
				System.out.println("정확한 수를 입력하세요.");
			}
		}
	}
}
