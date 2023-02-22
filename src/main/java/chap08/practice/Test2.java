package chap08.practice;

import java.util.Scanner;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

public class Test2 {

    public static void main(String[] args) {
//    	이름, 나이, 연락처 정보를 담는 객체를 만들어서 여러 명의 정보를 등록한 뒤에 이름을 검색하는 
//    	기능을 구현하여 검색된 정보를 출력하는 코드를 작성하세요. 
//    	(단, 이름은 키보드로부터 입력받은 값으로 검색하고 이름에'0'을 입력하면 프로그램을 종료합니다.)
    	/*
	    	ex)
				== List == 
				Dooli 
				Heedong
				Douner
				Ddochi
				Michol
				
				신상을 알고 싶은 사람의 이름을 입력해주세요 : Dooli
				Friend(name=Dooli, age=60, phone=010-0001-0001)
				
				신상을 알고 싶은 사람의 이름을 입력해주세요 : 0
				종료합니다.
		*/
    	Friend dooli = Friend.builder().name("Dooli").age(60).phone("010-0001-0001").build();
    	Friend heedong = Friend.builder().name("Heedong").age(50).phone("010-0002-0002").build();
    	Friend douner = Friend.builder().name("Douner").age(40).phone("010-0003-0003").build();
    	Friend ddochi = Friend.builder().name("Ddochi").age(30).phone("010-0004-0004").build();
    	Friend michol= Friend.builder().name("Michol").age(20).phone("010-0005-0005").build();
    	Friend[] friends = {dooli, heedong, douner, ddochi, michol};
    	System.out.println("== List ==");
    	for(Friend friend : friends) {
    		System.out.println(friend.getName());
    	}

    	Scanner sc = new Scanner(System.in);
    	System.out.print("신상을 알고 싶은 사람의 이름을 입력해주세요 : ");
    	String search = sc.next();
    	if (search.equals("0")) {
    		System.out.println("종료합니다.");
    	}
    		
    	for(int i = 0; i < friends.length; i++){
    		if(friends[i].getName().equals(search)) {
    			System.out.println(friends[i].toString());
    		}
    	}
    }
    
}

@Builder
@Getter
@ToString
class Friend{
	private String name;
	private int age;
	private String phone;	
}