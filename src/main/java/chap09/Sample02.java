package chap09;

public class Sample02 {
	public static void main(String[] args) {
		Car car1 = new ElectricCar("red", "Hyundai");
		car1.printInfo();
//		Car car2 = new GasolineCar("black", "Kia");
//		car2.printInfo();
		//car1.setColor("Gray");//Car 에는 setColor()가 없어서 자료형을 Car로 받으면 접근 안됨.
		
		car1 = new GasolineCar("red", "Hyundai");
		car1.printInfo();
	}
}
