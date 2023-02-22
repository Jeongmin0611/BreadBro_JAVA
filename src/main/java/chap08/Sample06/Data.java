package chap08.Sample06;

public class Data {
	
	String name; 
	int age; 
	
	public Data() {
		System.out.println("Data 초기화합니다.");
		this.name = "빵형";
		this.age = 21;
	}

	public Data(String name) {
		this.name = name;
	}

	public Data(String name, int age) {
		System.out.println("Data 초기화합니다.");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + ", age=" + age + "]";
	}
	
	
}
