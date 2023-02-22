package chap09;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Car {
	protected String color; //상속받은 클래스 내에서는 접근가능.
	protected String manufacturer;
	
	public void printInfo() {
		System.out.println("이 차의 색은 : "+this.color);
		System.out.println("이 차는 "+fillUp());
		System.out.println("이 차는 "+this.manufacturer + "에서 만들었습니다.");
	}
	
	
	public abstract String fillUp();
}
