package chap11;

import java.util.ArrayList;

public class Sample03 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		list.add("넷");
		list.add("다섯");
		
		list.add(2, "둘 쩜 오");
		for(String s: list) System.out.println(s);
		list.remove(2);
		
		System.out.println("============================================");
		for(String s: list) System.out.println(s);
		
		System.out.println("============================================");
		var delArr = new ArrayList<String>();
		delArr.add("둘");
		delArr.add("셋");
		list.removeAll(delArr);
		for(String s: list) System.out.println(s);
		
		System.out.println("============================================");
		list.removeAll(list);//자기 자신을 넣으면 다지워짐.
		//list.clear();
		for(String s: list) System.out.println(s);
	}
}
