package chap04;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 사이의 학점을 입력하세요 : ");
		int inputNum = sc.nextInt();
		String score = (inputNum < 100 && inputNum >= 90) ? "A" :
							(inputNum < 90 && inputNum >= 80) ? "B" :
								(inputNum < 80 && inputNum >= 70) ? "C" :
									(inputNum < 70 && inputNum >= 60) ? "D" : "F";
		System.out.printf("학점 (%d)은 %s입니다.",inputNum,score);
	}
}
