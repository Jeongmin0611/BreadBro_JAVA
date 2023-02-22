package chap11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample09 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("dog");
		list.add("dog");
		list.add("cat");
		list.add("cat");
		list.add("lion");
		list.add("lion");
		
		System.out.println(list.toString());
		
		Set<String> hs = new HashSet<>();
		hs.addAll(list);
		System.out.println(hs.toString());
		hs.add("lion");
		System.out.println(hs.toString());
		hs.add("tiger");
		System.out.println(hs.toString());
		System.out.println("------------------------");
		hs.forEach(x -> System.out.println(x));
		System.out.println("------------------------");
		hs.forEach(System.out::println);
		System.out.println("------------------------");
		hs.iterator().forEachRemaining(System.out::println);
		
		System.out.println("\n 'dog'가 존재하나요? " + hs.contains("dog"));
		System.out.println("\n 'bird'가 존재하나요? " + hs.contains("bird"));
	}
}
