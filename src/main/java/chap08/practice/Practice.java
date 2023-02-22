package chap08.practice;

public class Practice {
	public static void main(String[] args) {
		//내부 클래스를 인스턴스로 만들려면 외부클래스를 먼저 객체로 생성해주어야 함.
		Animal animal = new Animal();
		Animal.cat cat = animal.new cat();
		cat.legsCnt = 4;
		cat.name = "쫀떡이";
		cat.printCatInfo();
	}
}
