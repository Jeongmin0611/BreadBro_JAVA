package chap08.Sample09;

public class Data {
	String name;
	int age;
	public Data() {
		//System.out.println("Data 초기화합니다."); this() 위에 다른 메소드가 있으면 에러.
		this("김형",21);//생성자가 다른 생성자를 호출할 수 있음.
	}
	public Data(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
	
}
