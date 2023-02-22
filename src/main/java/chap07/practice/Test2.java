package chap07.practice;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//    	[가위 바위 보 게임]으로 키보드로부터 값을 입력받아서 랜덤값과 비교하여 승리 여부를 출력합니다.
//    	입력받는 값은 1자리 숫자로 가위는 1을 바위는 2를 보는 3을 입력받습니다. 0을 입력하기 전에 까지는
//    	무한 반복 처리하면 0을 입력할 경우 프로그램을 종료합니다.
//    	[가위(1), 바위(2), 보(3), 종료(0)]

//    	결과는 승/패/비김으로 출력합니다. 
    	
    	Scanner sc = new Scanner(System.in);
    	do {
    		System.out.print("숫자를 입력하세요 : ");
    		int input = sc.nextInt();
    		if(input == 0) {
    			System.out.println("프로그램을 종료합니다.");
    			break;
    		}else {
    			int npc = (int)(Math.random() * 3 + 1);
    			System.out.printf("컴퓨터 : "+npc+"\n");
    			String result = (input == npc) ? "비김" :((input - npc) == -1) ? "패" : "승";
    			System.out.println("결과 : "+result);
    		}
    	}while(true);
    	
    }
}
/*
	나			적
	1(가위)		1(가위)	비김
	1(가위)		2(바위)	패
	1(가위)		3(보)	승
	2(바위)		1(가위) 승
	2(바위)		2(바위) 비김
	2(바위)		3(보)	패
	3(보)		1(가위)	패
	3(보)		2(바위)	승
	3(보)		3(보)	비김
*/




