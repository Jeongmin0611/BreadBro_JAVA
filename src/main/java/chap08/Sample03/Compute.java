package chap08.Sample03;

public class Compute {
	int result;
	
	void setValue(int val) {
		result += val;
	}
	
	void setValue(int val, int val2) {
		result += val + val2;
	}
	
	void setValue(int val, int val2, int val3) {
		result += val + val2 + val3;
	}
	
	int getValue() {
		return result;
	}
}
