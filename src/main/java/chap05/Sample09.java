package chap05;

import java.util.Arrays;

public class Sample09 {
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3};
		int[][] num2 = {
				{1, 2, 3}, {4, 5, 6}, {7}, {8, 9, 10}, {11, 12, 13}
		};
		System.out.println(Arrays.toString(num1));//1차원 배열
		System.out.println(Arrays.deepToString(num2));//2차원 이상
	}
}
