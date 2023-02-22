package chap10;

public class Sample06<T> {// 변수 중에 T가 포함되어 있을 때 이렇게 써주면 됨.
	//객체를 생성할 떄 자료형을 정해줌.
	 private T t;//자바소스 실행할 때 String이나 integer같은 걸로 바꿔줌.

	public T getA() {
		return t;
	}

	public void setA(T t) {
		this.t = t;
	}
	 
	 
}
