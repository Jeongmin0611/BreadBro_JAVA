package chap04.practice;

import java.util.Scanner;

public class Test4 {
	/*
	 * 정수의 값을 입력받고 입력받은 값이 양의 정수이면 그냥 출력하고 음의 정수이먼 양의 정수로 변환하여 출력하세요.
	 *
	 * ex) 
	 * 정수값을 입력하세요 : 4
	 * 출력값 : 4
	 * 
	 * 정수값을 입력하세요 : -4
	 * 출력값 : 4
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요 : ");
		int inputNum = sc.nextInt();
		int result = (inputNum > 0) ? inputNum : inputNum * -1;
		System.out.println("출력 값 : " + result);
	}
}
