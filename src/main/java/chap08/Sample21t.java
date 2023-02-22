package chap08;

import chap08.Sample21.PrintServiceImpl;

public class Sample21t {
	//Default 접근자라서 여기서 쓰면 에러(같은 패키지 내에서만 사용가능)
	//public static DataServiceImpl data = new DataServiceImpl();
	public static PrintServiceImpl print = new PrintServiceImpl();
	
	public static void main(String[] args) {
		String name = "VC";
		print.printMessage();
		
	}
}
