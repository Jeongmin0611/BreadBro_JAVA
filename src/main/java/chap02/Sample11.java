package chap02;

import java.util.Scanner;

public class Sample11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String  in = sc.next();//입력한 문자열이 공백이 나오기 전까지 구해줌.
		//String  in2 = sc.next();//입력한 문자열이 공백이 나오기 전까지 구해줌.
		//int inNum = sc.nextInt();
		//long inLong = sc.nextLong();
		//char inChar = sc.next().charAt(0);
		
		//apple banana
		//System.out.printf("입력한 값 : %s\n글자수 %d\n",in,in.length());//apple
		//System.out.printf("입력한 값 : %s\n글자수 %d\n",in2,in2.length());//banana
		
		String  in = sc.nextLine();
		System.out.printf("입력한 값 : [%s]\n글자수 %d\n",in.toUpperCase().trim(),in.trim().length());//중간공백빼고 좌우공백제거
		sc.close();
	
	}

}
