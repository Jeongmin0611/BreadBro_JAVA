package chap06;

import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 키보드로 숫자를 입력받아서 1부터 입력받은 수만큼의 배열에 담아서 배열의 내용을
		 * for문을 이용해서 출력하세요. (10을 입력하면 배열[0] = 1, 배열[1] = 2, 배열[2] = 3...) 
		 * ex)
		 * 숫자를 입력하세요 : 5
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNum = sc.nextInt();
		int[] intArr = new int[inputNum];
		for(int i = 0; i < intArr.length; i++ ) {
			intArr[i] = i+1;
			System.out.println(intArr[i]);
		}
		sc.close();
	}
}
