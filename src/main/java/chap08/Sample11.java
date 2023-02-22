package chap08;

public class Sample11 {
	
	void localMethod() {
		int age = 23;
		
		class LocalClass{//메소드 내부클래스는 접근제어자 선언하지 않음.
			public void howOldAreYou() {
				System.out.printf("빵형은 %d살",age);
			}
		}
		
		LocalClass localClass = new LocalClass();//main()에서 쓰려면 객체를 아예 생성해야 쓸 수 있음.
		localClass.howOldAreYou();
	}
	
	void localMethod2() {
		int age = 23;
		
		class LocalClass{
			/*지역 클래스는 이름이 같아도 상관없다. 컴파일할 떄 $+숫자를 붙여 구별하기 때문
			 * ex) Sample11$1LocalClass.class, Sample11$2LocalClass.class
			 * */
			public void howOldAreYou() {
				System.out.printf("빵형은 %d살",age);
			}
		}
		
		LocalClass localClass = new LocalClass();
		localClass.howOldAreYou();
	}
	
	public static void main(String[] args) {
		//지역클래스(지역 메소드 안에 있는 클래스)를 사용하기 위해선 자기 자신을 객체로 만들어줘야 함.
		Sample11 sample11 = new Sample11();
		sample11.localMethod();
	}
}
