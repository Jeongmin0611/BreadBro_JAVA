package chap04.practice;

import java.util.Scanner;

public class Test2 {
	/*
	 * 100점 만점의 학점을 입력받아서 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 60점 미만이면
	 * F를 구하는 프로그램을 작성하세요.(입력받는 점수는 0점에서 100점 사이의 값만 넣어야 함.)
	 * 
	 * ex)
	 * 0~100 사이의 학점을 입력하세요 : 55
	 * 학점은(55)은 F입니다.
	 * 
	 * 0~100 사이의 학점을 입력하세요 : 99
	 * 학점은(99)은 A입니다.89
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 사이의 학점을 입력하세요 : ");
		int inputScore = sc.nextInt();
		String score = (inputScore > 90 && inputScore < 100) ? "A" :
							(inputScore > 80  && inputScore < 90) ? "B" :
								(inputScore > 70  && inputScore < 80) ? "C" :
									(inputScore > 60  && inputScore < 70) ? "D" : "F";
		
		System.out.printf("학점(%d)은 %s입니다.",inputScore,score);
	}
}
