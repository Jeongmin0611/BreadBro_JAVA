package chap09;

public class Sample05 {
	public static void main(String[] args) {
		ICompute a = new Apartment1();
		float area = a.compute(30);
		System.out.println(area);
		System.out.println(a.toPyung(30));
	}
}

class Apartment1 implements ICompute{
	public float compute(int area) {
//		pyung++;
		return area * pyung;
	}
	@Override
	public float toPyung(int area) {
		return ICompute.super.toPyung(area);
	}
}

class Apartment2 implements ICompute{
	public float compute(int area) {
//		pyung++;
		return area * pyung;
	}
	
}

class Apartment3 implements ICompute{
	public float compute(int area) {
//		pyung++;
		return area * pyung;
	}
}

class Apartment4 implements ICompute{
	public float compute(int area) {
//		pyung++;
		return area * pyung;
	}
}

class Apartment5 implements ICompute{
	public float compute(int area) {
//		pyung++;
		return area * pyung;
	}
}

interface ICompute{//인터페이스에 정의된 변수들은 전부 다 final static
	float pyung = 3.3f; //static final float pyung = 3.3f;
	float compute(int area);
	//오버라이드 하지 않은 클래스들은 디폴트 메소드가 구현됨.
	default float toPyung(int area) {//jdk 1.8 이상 가능함.
		return area / pyung;
	} //새로운 메소드 추가 
}