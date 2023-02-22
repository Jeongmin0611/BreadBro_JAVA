package chap10;

public class Sample05 {
	public static void main(String[] args) {
		Sample04 age = new Sample04();
		Sample04 name = new Sample04();
		
		//클래스명 인스턴스명 = new 생성자();
//		클래스명<타입> 인스턴스명 = new 생성자<타입>();
		
		//Object로 변수를 선언했기 때문에 아무 자료형이나 다 세팅가능
		age.setA(18);
		name.setA("빵형");
		
		//하지만 꺼내서 사용할 떄는 해당 자료형이 정확해야 하는데
		//object로 선언한 것은 꺼낼때 구분이 안감.
		//그래서 나온게 제너릭
		int personAge = (int)name.getA();
		String personName = (String)name.getA();
		
		System.out.printf("%s은 %d살",personName,personAge);
	}
}
