package chap08;

public class Sample04 {

	static int total = 0;
	public static void main(String[] args) {
		System.out.printf("결과 : %d\n",sum(1));
		System.out.printf("결과 : %d\n",sum(2,3));
		System.out.printf("결과 : %d\n",sum(4,5,6));
		System.out.printf("결과 : %d\n",sum(7,8,9,10,11,12,13,14,15,16));
	}
	
	public static int sum(int... a) {//가변인자는 무조건 마지막에 중복안됨.
		for(int i : a ) total += i;
		return total;
	}
}
