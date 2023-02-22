package chap13;

import java.text.DecimalFormat;

public class Sample05 {
	public static void main(String[] args) {
		double myMoney1 = 2000000;
		double myMoney2 = -2000000;
		double myMoney3 = 1000000;
		double myMoney4 = myMoney3 / myMoney1;
		//;를 기준으로 결과가 양수일때 왼쪽 음수일때 오른쪽 포맷 
		DecimalFormat df = new DecimalFormat("(수익)#,###;(손실)-#,###");
		System.out.println(df.format(myMoney1));
		System.out.println(df.format(myMoney2));
		
		DecimalFormat df2 = new DecimalFormat("##0%");
		System.out.println(df2.format(myMoney4));
	}
}
