package chap08;

import lombok.Builder;

public class Sample25 {
	public static void main(String[] args) {
		//생성자를 생성하려는 클래스에 변수가 많을 떄 변수들 중에 골라서 생성자를 만들수 있음.(builder패턴)
		
		Person2 per1 = Person2.builder()
							  .no(1)
							  .build();
		Person2 per2 = Person2.builder()
							  .no(2)
							  .name("Mary")
							  .build();
		Person2 per3 = Person2.builder()
							  .no(3)
							  .name("Peter")
							  .phone("010-1234-5678")
							  .build();
	}
}


class Person2{
	private final int no;
	private String name;
	private String phone;

	@Builder
	public Person2(int no, String name, String phone) {
		this.no = no;
		this.name = name;
		this.phone = phone;
	}
	
}