package chap09.Sample04;

public class Cat extends Pet{

	public Cat(boolean wing, int legCount) {//상속받은 하위클래스는 생성자를 무조건 만들어주어야 함.
		super(wing, legCount);
	}

	@Override
	public void run(String name) {
		System.out.printf("%s는 소리없이 조용히 뜁니다.\n",name);
	}
	
}
