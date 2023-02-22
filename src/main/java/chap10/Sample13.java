package chap10;

class NumberBox {
	public <E extends Number> void setNumber(E e) {
		System.out.printf("입력된 숫자는 [%s] 입니다.\n",e.toString());
	}
}

public class Sample13 {
	public static void main(String[] args) {
		NumberBox nb = new NumberBox();
		nb.setNumber(1234);
		nb.setNumber(1234.4355);
//		nb.setNumber("dddddd");
//		nb.setNumber('a');
	}
}
