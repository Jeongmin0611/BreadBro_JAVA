package chap11;

import java.util.ArrayList;

public class Sample02 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		list.add("다섯");
		
		list.add(2, "둘 쩜 오");
		list.set(2, "이 쩜 오");
		
		for(String s: list) System.out.println(s);
	}
}
