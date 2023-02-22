package chap08.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//    	100 이하의 정수를 입력받아서 for문을 사용하지 않고 메소드만을 이용하여 
//    	1부터 입력받은 수까지의 합을 구하는 코드를 작성하세요.
//    	(단, '0(영)'을 입력하면 프로그램을 종료합니다.)
    	/*
	    	ex)
				100이하의 정수를 입력해주세요 : 200
				큰 값을 입력했습니다.
				100이하의 정수를 입력해주세요 : 10
				55
				100이하의 정수를 입력해주세요 : 0
				종료합니다.
		*/
    	System.out.print("100이하의 정수를 입력해주세요 :");
    	Scanner sc = new Scanner(System.in);
    	int input = sc.nextInt();
    	if(input > 100) {
    		System.out.println("큰 값을 입력했습니다.");
    		return;
    	}
    	System.out.println(sum(input,0));
    }
    
    private static int sum (int num, int total) {
    	if(num == 0) {
    		return total;
    	}else {
    		total += num--;
    		return sum (num,total);
    	}
    }
}

