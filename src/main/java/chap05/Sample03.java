package chap05;

public class Sample03 {
	public static void main(String[] args) {
		int[] number1 = new int[3];
		number1[0] = 10;
		number1[1] = 20;
		number1[2] = 30;
		System.out.printf("배열의 갯수는 %d 개 입니다.\n",number1.length);
		
		int[] number2 = {10,20,30,40};
		System.out.printf("배열의 갯수는 %d 개 입니다.",number2.length);
	}	
}
