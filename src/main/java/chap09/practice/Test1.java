package chap09.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
//    	Data라는 자료형을 만들고 특정값이 들어왔을 때 오름차순과 내림차순을 처리하는 클래스를
//    	각각 만들고 처리하는 메소드는 sort()메소드로 처리하게 구현하세요. (다형성 활용)
    	/*
    	 * ex) 
    	 *		입력 : 1 2 6 9 4
    	 * 		오름차순 : [1, 2, 4, 6, 9]
    	 *      내림차순 : [9, 6, 4, 2, 1]
    	 */
    	
    	Scanner sc = new Scanner(System.in);
    	int[] inputArr = new int[5];
    	int idx = 0;
    	System.out.print("입력 : ");
    	while(sc.hasNext()) {
    		int input = sc.nextInt();
    		inputArr[idx] = input; 
    	}
    	Data asc = new Asc();
    	System.out.println(Arrays.toString(asc.sort(inputArr)));
    }
}


abstract class Data{
	public abstract int[] sort(int[] inputArr);
}


class Asc extends Data{
	
	private int[] data;
	
	@Override
	public int[] sort(int[] inputArr) {
		for(int i = 0; i < inputArr.length; i++) {
			for(int j = 0; j < i; j++) {
				int temp;
				if (inputArr[i] > inputArr[j]) {
					temp = inputArr[i];
					inputArr[i] = inputArr[j];
					inputArr[j] = temp;
				}
			}
		}
		return inputArr;
	}
}
