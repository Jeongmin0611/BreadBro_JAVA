package chap11;

import java.util.ArrayList;

public class Sample01 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		list.add("다섯");
		
		list.add(5, "둘 쩜 오");
		//list.add(6, "둘 쩜 오"); 중간에 비면 안됨.
		
		for(String s: list) {
			System.out.println(s);
		}
		
		String[] str1 = {"하나","둘","셋","넷","다섯"};
		String[] str2 = new String[6];
		str2[0] = "하나";
		str2[1] = "둘";
		str2[2] = "둘 쩜 오";
		str2[3] = "셋";
		str2[4] = "넷";
		str2[5] = "다섯";
		
		
	}
}
