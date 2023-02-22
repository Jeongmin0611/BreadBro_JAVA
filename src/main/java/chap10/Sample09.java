package chap10;

class Computer1 {
	private String componentClassName;
	
	//public Computer1() {}가 없을 떄 가능
	public <T extends ComputerPart> Computer1(T component) {
		// 생성자에서 제너릭을 쓸 때는 생성자를 벗어나면 T를 쓰지 못함. 
		this.componentClassName = component.getClass().getName();
	}
	
	public void toInfo() {
		System.out.println(componentClassName);
	}
}

public class Sample09 {
	public static void main(String[] args) {
		Computer1 mem = new Computer1(new Memory());
	}
}
