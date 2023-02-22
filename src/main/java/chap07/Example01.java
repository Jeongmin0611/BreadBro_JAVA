package chap07;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int inputNum = sc.nextInt();
		if(inputNum > 0) System.out.println(inputNum+" 는 양수입니다.");
		else System.out.println(inputNum+" 는 음수입니다.");
	}
}
