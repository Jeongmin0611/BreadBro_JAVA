package chap08;

public class Sample19 {
	public static void main(String[] args) {
		//1. 내 지갑에 10,000원 있음.
		Wallet myWellet = new Wallet(10000);
		
		//2. 2,000원 짜리 물품을 구했으며 세금 10% 더해서 2,200원 지불함.
		//myWellet.myMoney -=2000;
		myWellet.pay(2000);
		
		//3. 내 지갑의 남은 돈을 확인
		myWellet.checkMyMoney();
	}
}

class Wallet{
	private int myMoney;//private 해당 클래스 내에서만 접근 가능
	
	public Wallet(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void checkMyMoney() {
		System.out.println("남은 돈 : " + myMoney);
	}
	public void pay(int payMoney) {
		myMoney -= (payMoney * 1.1);
	}
}