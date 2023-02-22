package chap08.practice;

import java.util.Arrays;

import lombok.Builder;
import lombok.ToString;

public class Test4 {
    public static void main(String[] args) {
//    	이름(String name)과 나이(int age)를 맴버 필드로 갖는 Member 클래스를 작성하고 빌더패턴의 형태로
//    	3명의 정보를 Member배열에 등록하고 출력하는 프로그램을 작성하세요.
		/* Member(name=빵형, age = 10), Member(name=타노스, age = 8), Member(name=상도, age = 9) */
    	Member[] members = {
			    				Member.builder().name("빵형").age(10).build(),
			    				Member.builder().name("타노스").age(8).build(),
			    				Member.builder().name("상도").age(9).build()
		    				};
    	System.out.println(Arrays.toString(members));
    }
}

//@Builder --> 이건 AllArgs랑 같은거임. pk를 생성하는 경우라면 비추, 대부분 생성자레벨에 붙임.
@ToString
class Member{
	private String name;
	private int age;
	
	@Builder
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

