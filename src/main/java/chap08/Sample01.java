package chap08;

public class Sample01 {
	/*필드 영역 시작*/
	String name = "맴버 변수";	//접근 제어자가 생략된 맴버 변수
	
	private int age;			//접근제어자가 있는 멤버 변수
	
	//var age = 10;				//지역변수인 타입추론변수는 사용할 수 없음.

	/*필드 영역 끝*/
	
	/*메소드 영역 시작*/
	public static void main(String[] args) {}
	public void sayHello() {
		var friend ="친구야"; //메소드 내의 변수를 지역변수라고 함.
		System.out.printf("%s 안녕?\n",friend);
	}
	
	public void sayHello(String friend) {
		System.out.printf("%s 안녕?\n",friend);
	}
	public String getName() { //Getter
		return name;
	}
	public void setName(String name) { //Setter
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*메소드 영역 끝*/
	
	/*생성자 영역 시작*/
	
	public Sample01() {}
	public Sample01(int age,String name) {
		this.age = age;
		this.name = name;
	}
	
	/*생성자 영역 끝*/
}
