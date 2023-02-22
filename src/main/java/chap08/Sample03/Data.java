package chap08.Sample03;

public class Data {
	int value;
//	void setValue(int val) {//인자와 전역변수가 변수명이 같을 경우 인자의 변수명이 더 우선권을 가짐. 구별하기 위해 this 넣어줌.
//		value = val;
//	}
//	int getValue() {
//		return value;
//	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
