package chap06.practice;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
//    	보기와 같이 배열에 입력된 값을 입력받아서 몇 번 검색하여 찾았는지 선형 검색을 통한 소스코드를 작성하세요.
    	/*
    	ex)
			4, 6, 9, 2
			
			검색할 값이 존재하는 경우)
			검색할 값을 입력하세요 : 2
			4번 검색하여 값을 찾았습니다.
			
			검색할 값이 존재하지 않는 경우)
			검색할 값을 입력하세요 : 5
			찾을 수 없는 값입니다.
		*/
    	int cnt = 1;
    	boolean yn = false;
    	int[] intArr = {4, 6, 9, 2};
    	System.out.print("검색할 값을 입력하세요 : ");
    	Scanner sc = new Scanner(System.in);
    	int input = sc.nextInt();
    	for(int i = 0; i < intArr.length; i++) {
    		if(input == intArr[i]) {
    			yn = true;
    			break;
    		}else{
    			cnt++;
    		}
    	}
    	if(!yn) System.out.print("찾을 수 없는 값입니다."); 
    	else System.out.printf("%d번 검색하여 값을 찾았습니다.",cnt);
    }
}