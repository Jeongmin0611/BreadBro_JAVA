package chap11;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Sample10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("사자");
		list.add("호랑이");
		list.add("원숭이");
		list.add("사자");
		list.add("호랑이");
		list.add("원숭이");
		
		System.out.println(list.toString());
		System.out.println("1 > arrayList를 treeset으로 가져옵니다. [addAll()]");
		var ts = new TreeSet<String>();
		ts.addAll(list);
		System.out.println(ts.toString());
		ts.add("사자");
		System.out.println(ts.toString());
		ts.add("기린");
		System.out.println(ts.toString());
		if(!ts.contains("토끼")) ts.add("토끼");
		System.out.println(ts.toString());
		
		System.out.println(ts.ceiling("자"));
		System.out.println(ts.floor("자"));
	}
}
