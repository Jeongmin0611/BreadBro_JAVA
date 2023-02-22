package chap09;

public class Sample06 {
	public static void main(String[] args) {
		ICompute a = new Apartment1();
		float area = a.compute(30);
		System.out.println(area);
		System.out.println(a.toPyung(30));
	}
}

class Villa implements IExcute{
	@Override
	public float compute(int area) {
//		pyung++;
		return area * pyung;
	}
}

interface IExcute{//인터페이스에 정의된 변수들은 전부 다 final static
	float pyung = 3.3f; //static final float pyung = 3.3f;
	float compute(int area);
	//오버라이드 하지 않은 클래스들은 디폴트 메소드가 구현됨.
	default float toPyung(int area) {//jdk 1.8 이상 가능함.
		return area / pyung;
	} //새로운 메소드 추가 
}