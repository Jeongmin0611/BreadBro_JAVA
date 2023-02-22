package chap11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sample07 {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("dog");
		list.add("cat");
		list.add("lion");
		
		System.out.println("1. forEach()");
		//list.forEach((String x) -> System.out.println(x));
		list.forEach(x -> System.out.println(x));
		System.out.println("\n2. for문");
		for(int i = 0; i < list.size(); i++) System.out.println(list.get(i));
		
		System.out.println("\n3. 향상된 for문");
		for(String s : list) System.out.println(s);
		
		System.out.println("\n4. iterrator");
		//iterrator에서 객체를 삭제하거나 변경하면 컬렉션에도 그대로 반영됨.
		Iterator it1 = list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
			//it1.remove();
		}
		//System.out.println(list.toString() + " - " + list.size());
		
		System.out.println("\n5. iterrator(Lambda)");
		Iterator it2 = list.iterator();
		it2.forEachRemaining(x -> System.out.println(x));
		
		System.out.println("\n6. iterrator(참조 메소드)");
		Iterator it3 = list.iterator();
		it3.forEachRemaining(System.out::println);
		
		System.out.println("\n7. sort");
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.toString());
	}
}
