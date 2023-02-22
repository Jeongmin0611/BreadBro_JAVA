package chap06;

public class Sample05 {
	public static void main(String[] args) {
		/*
	 #########	9	0 
	  #######	7	1
	   #####	5	2
		###		3	3
		 #		1	4
		 * */
		//	초기식과 증감식을 여러 개를 쓸 수 있다.
		for(int i = 0, l = 9; i < 5; i++, l-=2) { // l-2
			//공백 출력
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//# 출력
			for(int k = 0; k < l; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
