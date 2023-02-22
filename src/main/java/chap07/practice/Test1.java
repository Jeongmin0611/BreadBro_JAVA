package chap07.practice;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
//    	입력받은 수가 양수인지 음수인지 판단하는 프로그램을 작성하세요.
    	/*
    	 	ex)
		    	정수를 입력하세요 : 7
		    	7은 양수입니다.
		    	
		    	점수를 입력하세요 : -7
		    	-7은 음수입니다.
    	*/
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("정수를 입력하세요 : ");
    	int input = sc.nextInt();
    	if(input < 0) {
    		input *= -1;
    		System.out.printf("%d은 음수입니다.",input);
    	} else System.out.printf("%d은 양수입니다.",input);
    }

}
