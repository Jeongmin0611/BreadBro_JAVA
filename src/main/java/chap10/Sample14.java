package chap10;

public class Sample14 {
	public static void main(String[] args) {
		Money<Integer> m1 = new Money();
		m1.setMoney(2000);
		
		//Money<Double> m2 = new Money(); Money<Double>으로 선언할수 있지만 자료형이 Double로 재한됨.
		Money<Integer> m2 = new Money();
		m2.setMoney(600000);
		
		Wallet wallet = new Wallet();
		wallet.insertMoney(m1);
		wallet.insertMoney(m2);
	}
}

class Wallet{
	double totalMoney = 0;
	
	public void insertMoney(Money<?> m) {
		this.totalMoney += m.getMymoney();
	}
}

class Money<T extends Number>{
	double myMoney;
	
	public double getMymoney() {
		return myMoney;
	}

	public void setMoney(T info) {
		this.myMoney = info.doubleValue();//T에 뭐가 들어올지 모르니 형 변환해서 넣어줌.
	}
}
