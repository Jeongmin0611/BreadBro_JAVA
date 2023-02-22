package chap10;

public class Sample07 {
	public static void main(String[] args) {
		Sample06<Integer> age = new Sample06<>();//jdk1.7 부터는
		var name = new Sample06<String>();//jdk10 부터는
		
		age.setA(18);
		name.setA("빵형");
		
		int personAge = age.getA();
		String personName = name.getA();
		
		System.out.printf("%s은 %d살",personName,personAge);
	}
}
