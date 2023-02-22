package chap16;

public class Sample01 {
	public static void main(String[] args) {
		Sample01Function f1 = () -> System.out.println("샘플01테스트데이터출력");
		f1.test();
		
		/*
		 * 익명 내부클래스를 구현하는 것과 같음.
			Sample02Function f2 = new Sample02Function() {
				@Override
				public String test(String a) {
					return a;
				}
			};
		*/
		
		//Sample02Function f2 = (a) -> {return a;};//return 붙일 때는 한줄이어도 {}을 무조건 넣어줘야 한다.
		//Sample02Function f2 = a -> {return a;};//파라밑가 1개일 때는 ()도 생략가능
		Sample02Function f2 = a -> a; //함수가 반환형일 때는 return도 생략해도 됨.
		System.out.println(f2.test("샘플02테스트데이터출력"));
	}
}

@FunctionalInterface
interface Sample01Function{
	public void test();
}

@FunctionalInterface
interface Sample02Function{
	public String test(String a);
	//함수 선언부만 만들어 주고 구현체는 사용할때 만들기 때문에 추상 클래스가 여러개면 추론하기가 어려워 
	//2개이상은 사용할 수 없음.
}