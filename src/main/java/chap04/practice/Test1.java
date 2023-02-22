package chap04.practice;

import java.util.Scanner;

public class Test1 {
	/*
	 * 두 개의 값을 입력받아서 큰 수를 출력하세요.(단 같으면 0으로 출력)
	 * ex)
	 * 답 입력 > 30 20
	 * 출력 > 30
	 * 
	 * 두개의 수를 띄어쓰기하여 입력해주세요 : 30 20
	 * 입력한 값 중 큰 수는 30 입니다.
	 * 
	 * 답 입력 > 4 4
	 * 출력 > 0
	 * 
	 * 두개의 수를 띄어쓰기하여 입력해주세요 : 4 4
	 * 입력한 값 중 큰 수는 0 입니다.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 수를 띄어쓰기하여 입력해주세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = (num1 > num2) ? num1 : 
						(num1 < num2) ? num2 : 0;  
		
		System.out.printf("입력한 값 중 큰 수는 %d 입니다.",result);
	}
}
