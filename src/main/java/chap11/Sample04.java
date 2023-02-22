package chap11;

import java.util.ArrayList;

public class Sample04 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		list.add("다섯");
		
		list.add(2, "둘 쩜 오");
		list.remove(2);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d번 - %s\n",(i+1),list.get(i));
		}
	}
}
