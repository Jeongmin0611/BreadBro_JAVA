package chap08;

import chap08.Sample06.Data;

public class Sample07 {
	public static void main(String[] args) {
		Data data1 = new Data();
		System.out.println(data1.toString());
		
		Data data2 = new Data("빵형",22);//Data 클래스가 같은 패키지에 있지 않기 때문에 import 해줘야함.
		System.out.println(data2.toString());
	}
	
}
