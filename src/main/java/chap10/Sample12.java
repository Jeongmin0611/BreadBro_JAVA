package chap10;

/*
  [접근제어자] (static) <E> [반환될자료형] 메소드명 (E e){
		...
		return [반환될자료형]
  } 
*/

class Data{
	private String value;
	
	public <T> void setValue(T t) {
		this.value = t.toString();
	}

	public String getValue() {
		return value;
	}
	
}

public class Sample12 {
	public static void main(String[] args) {
		Data data = new Data();
		data.setValue(1);
		data.setValue(2);
		System.out.println(data.getValue());
	}
}
