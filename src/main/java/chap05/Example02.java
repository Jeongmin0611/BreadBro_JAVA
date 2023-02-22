package chap05;

import java.util.Arrays;

public class Example02 {
	public static void main(String[] args) {
		int[][] numArr = new int[5][5];
		numArr[0][4] = 6;
		
		numArr[1][4] = 6;
		numArr[1][3] = 5;
		
		numArr[2][4] = 6;
		numArr[2][3] = 5;
		numArr[2][2] = 4;
		
		numArr[3][4] = 6;
		numArr[3][3] = 5;
		numArr[3][2] = 4;
		numArr[3][1] = 3;
		
		numArr[4][4] = 6;
		numArr[4][3] = 5;
		numArr[4][2] = 4;
		numArr[4][1] = 3;
		numArr[4][0] = 2;
		System.out.println(Arrays.toString(numArr[0]));
		System.out.println(Arrays.toString(numArr[1]));
		System.out.println(Arrays.toString(numArr[2]));
		System.out.println(Arrays.toString(numArr[3]));
		System.out.println(Arrays.toString(numArr[4]));
	}
}
