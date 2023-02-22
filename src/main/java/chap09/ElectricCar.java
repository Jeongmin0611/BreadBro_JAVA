package chap09;

public class ElectricCar extends Car{
	public ElectricCar(String color, String manufacturer) {//Car에 있는 fillUp()을 쓰기위해 생성자를 따로 구현 해줘야함.
		super(color, manufacturer);
	}

	@Override
	public String fillUp() {
		return "전기를 충전합니다.";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
