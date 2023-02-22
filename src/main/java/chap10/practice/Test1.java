package chap10.practice;

import lombok.Builder;
import lombok.ToString;

public class Test1 {
    public static void main(String[] args) {
//    	이름, 나이, 키, 몸무게, 연락처 정보를 담는 객체를 만듭니다. 제네릭을 활용하여 이름과 연락처는 문자열을 입력하게
//    	제한하고 나이, 키, 몸무게는 숫자(실수 포함)만 입력하게 제한하여 데이터를 넣고 toString() 메소드를 만들어서 
//    	내용을 출력하세요
    	Person p1 = Person.builder().name("빵형")
    								.age(21)
    								.height(184.5f)
    								.weight(78.3d)
    								.phone("010-2222-3333").build();
    	System.out.println(p1.toString());
    }
    
}

@ToString
@Builder
class Person<S extends String, N extends Number>{
	private S name;
	private N age; 
	private N height;
	private N weight;
	private S phone;
}
