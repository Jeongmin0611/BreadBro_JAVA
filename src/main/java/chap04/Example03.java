package chap04;

import java.util.Scanner;

public class Example03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 값을 입력하세요.");
		int inputNum = sc.nextInt();
		int printNum = (inputNum > 0) ? inputNum : inputNum * -1;
		System.out.println("출력값 : "+printNum);
	}
}
