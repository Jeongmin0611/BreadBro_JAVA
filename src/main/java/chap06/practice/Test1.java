package chap06.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
    	//키보드로부터 숫자를 입력받아서 1부터 입력받은 수만큼의 배열에 담아서 배열의 내용을 
    	//반복문 for를 사용하여 출력하세요. (10을 입력하면 배열[0] = 1, 배열[1] = 2 ... 배열[9] = 10 이런 식으로 출력)
		/*
		 * ex) 숫자를 입력하세요 : 5 
		 * 1 
		 * 2 
		 * 3 
		 * 4 
		 * 5
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		int[] inputArr = new int[input];
		for(int i = 0; i < inputArr.length; i++) {
			inputArr[i] = i+1;
			System.out.println(inputArr[i]);
		}
    }
}

