package chap07;

import java.util.Random;
import java.util.Scanner;

public class Example02 {
	/*
	 * [가위 바위 보 게임]으로 키보드로부터 값을 입력받아서 랜덤값과 비교하여 승리 여부를 출
	 * 력합니다. 입력받는 값은 1자리 숫자로 가위는 1을 바위는 2를 보는 3을 입력받습니다.
	 * 0을 입력하기 전까지 무한 반복 처리하며 0을 입력할 경우 프로그램을 종료합니다.
	 * [가위(1), 바위(2), 보(3)] 결과는 승/패/비김으로 출력합니다.
	 * ex)
	 * 숫자를 입력하세요 : 1
	 * 컴퓨터 : 2
	 * 결과 : 패
	 * 숫자를 입력하세요 : 0
	 * 프로그램을 종료합니다.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		do {
			System.out.print("숫자를 입력하세요 : ");
			int computer = random.nextInt(3)+1;
			int inputNum = sc.nextInt();
			System.out.printf("컴퓨터 : %d\n",computer);
			if(inputNum == 1 && computer == 2) {
				System.out.println("결과 : 패");
			}else if(inputNum == 1 && computer == 3) {
				System.out.println("결과 : 승");
			}else if(inputNum == 2 && computer == 3) {
				System.out.println("결과 : 패");
			}else if(inputNum == 2 && computer == 1) {
				System.out.println("결과 : 승");
			}else if(inputNum == 3 && computer == 1) {
				System.out.println("결과 : 패");
			}else if(inputNum == 3 && computer == 2) {
				System.out.println("결과 : 승");
			}else if(inputNum == computer) {
				System.out.println("결과 : 비김");
			}else if(inputNum == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}while(true);
		
		
	}
}
