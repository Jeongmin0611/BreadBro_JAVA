package chap06.practice;

public class Test3 {
    public static void main(String[] args) {
    	// 반복문을 이용해서 다음과 같은 결과를 출력하세요.
    	/*
    	 		* 
    	 	   *** 
    	 	  ***** 
    	 	 ******* 
    	 	********* 
    	 */
    	
    	for(int i= 0; i < 5; i++ ) {
    		for(int j = 0; j < 5-(i+1); j++) {
    			System.out.print(" ");
    		}
    		for(int k = 0; k < (i+1) + i; k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}