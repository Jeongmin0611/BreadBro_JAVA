package chap06;

import java.util.Arrays;

public class Sample08 {
	public static void main(String[] args) {
		String[] friends = {"Dooly", "chulSoo", "David"};
		
		for(int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
		System.out.println("--------------------------");
		for(String friend : friends) {
			System.out.println(friend);
		}
		System.out.println("--------------------------");
		//								인자
		Arrays.stream(friends).forEach(friend -> {
			System.out.println(friend);//매개변수	
		});
		System.out.println("--------------------------");
		Arrays.stream(friends).forEach(System.out::println);//인자가 1개일 때는 생략가능
		System.out.println("--------------------------");
		Arrays.stream(friends)
			  .map(friend -> "name : " + friend)
		      .forEach(friend -> {
			System.out.println(friend);//매개변수	
		});
	}
}
