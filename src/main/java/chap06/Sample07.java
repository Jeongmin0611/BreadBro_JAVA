package chap06;

public class Sample07 {
	public static void main(String[] args) {
		// 1단 부터 9단 까지
		for(int i = 1; i <=9; i++) {
			//1부터 9가지 곱할 수
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j,(i*j));
				if(true) continue;
				System.out.println("-------------------------");
			}
		}
	}
}
