package chap07.practice;

import java.util.Arrays;
import java.util.Random;

public class Test3 {

    public static void main(String[] args) {
//    	로또 추첨 번호를 예상하는 프로그램을 작성하세요.
    	
//    	임의의 숫자를 1에서 45까지의 수를 총 6개 추첨하여 당첨번호를 구한다.
//    	중복된 숫자는 있으면 안 된다.
		/* ex) 43 11 26 16 21 23 */
    	
    	Random ran = new Random();
    	int[] lotto = new int[6];
    	int cnt = 0;
    	
    	while(true) {
    		int lottoNum = ran.nextInt(44)+1;
    		if(cnt == 6) break;
    		if(lottoNum == lotto[0]) continue;
    		if(lottoNum == lotto[1]) continue;
    		if(lottoNum == lotto[2]) continue;
    		if(lottoNum == lotto[3]) continue;
    		if(lottoNum == lotto[4]) continue;
    		if(lottoNum == lotto[5]) continue;
    		lotto[cnt] = lottoNum;
    		cnt++;
    	}
    	System.out.println(Arrays.toString(lotto));
    }
}
