package chap08;

interface Greeting{
	//interface는 abstract을 붙여주지 않아도 자동으로 abstract으로 인식하게 됨.
	//interface의 기본 메소드는 무조건 추상메소드 
	public String sayHello(String name); 
}

public class Sample13 {
	//외부 익명 인터페이스 구현.
	public static void main(String[] args) {	
		Greeting g = new Greeting() {
			@Override
			public String sayHello(String name) {
				return name + " 안녕 !";
			}
		};
		System.out.println(g.sayHello("빵형"));
		
		Greeting g2 = (name) -> {//람다식으로 익명 인터페이스를 구현하게 되면 컴파일러가 따로 .class파일로 컴파일하지 않음.
			return name + " 안녕! ";
		};
		System.out.println(g2.sayHello("람다식 빵형"));
	}
}
