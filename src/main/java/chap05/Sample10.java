package chap05;

import java.util.Arrays;

public class Sample10 {
	public static void main(String[] args) {
		int[] correct = {1,2,3,4,5,6};
		
		int[][] answers = {
				{1,2,1,4,5,6},
				{1,1,3,4,5,6}, 
				{1,2,3,4,5,6}, //만점자
				{1,2,3,1,5,6},
				{1,2,3,1,5,3}
		};
		
		//만접자 찾기
		int no = 0;
		for(int[] answer : answers) {
			no++;
			if(Arrays.equals(correct, answer)) {
				System.out.printf("%d번 학생은 만점자 입니다.\n", no);
			}else {
				System.out.printf("%d번 학생은 만점자가 아닙니다.\n", no);
			}
		}
	}
}
