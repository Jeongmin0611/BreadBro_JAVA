package chap08.Sample02;

public class VO {
	String	name;
	int		age;
	
	static final int ONE;
	static final int TWO;
	static final int THREE;
	
	public static int ZERO;
	
	//public VO() {}
	static {//자바 프로그램이 메모리에 올라올 때 가장 먼저 올라옴(필드 변수보다)
		ONE = 1;
		TWO = 2; 
		THREE = 3;
	}
}
