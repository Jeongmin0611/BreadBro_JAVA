package chap04;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비교할 두 수를 입력하세요.");
		System.out.println("첫 번째 수 : ");
		int compareNum1 = sc.nextInt();
		System.out.println("두 번째 수 : ");
		int compareNum2 = sc.nextInt();
		int printNum = (compareNum1 > compareNum2) 
							? compareNum1 : (compareNum1 == compareNum2) 
									  ? 0 : compareNum2;
		System.out.println(printNum);
		sc.close();
	}
}
