package chap13;

import java.text.DecimalFormat;

public class Sample04 {
	public static void main(String[] args) {
		double myMoney = 50000000;
		System.out.println(myMoney);
		DecimalFormat df1 = new DecimalFormat("#,###,##0");
		//숫자를 지수형태로 표현할 수도 있음.
		DecimalFormat df2 = new DecimalFormat("0.04#E0");
		System.out.println(df1.format(myMoney));
		System.out.println(df2.format(myMoney));
	}
}
