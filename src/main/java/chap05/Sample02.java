package chap05;

public class Sample02 {
	public static void main(String[] args) {
		int[] number = {10,20,30};
		int[] number1 = new int[]{10,20,30};
		/*
		 * int[] number =new int[]{10,20,30};
		 * int[] number1 = new int[]{10,20,30};
		 * 변수를 초기화만 하고 사용하지 않으면 컴파일할 떄 변수를 재사용함.
		 * 반대로, 변수를 초기화 하고 사용하면 컴파일할 떄 변수를 재사용하지 않음.
		 * */
		System.out.println(number);
		System.out.println(number1);
	}
}
