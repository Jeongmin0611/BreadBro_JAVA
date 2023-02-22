package chap12;

public class Sample02 {
	public static void main(String[] args) {
		Color inputColor = Color.RED;
		//객체를 생성해서 직접 주소값 비교
		System.out.println(inputColor.equals(Color.RED) ? "RED" : "not Red");
		System.out.println(inputColor.equals(Size.SMALL) ? "RED" : "not Red");
	}
}

class Color {
	
	final static Color RED = new Color();//객체를 생성
	final static Color BLUE = new Color();
	final static Color ORANGE = new Color();
	
}

class Size{
	
	final static Size SMALL = new Size();
	final static Size MIDIUM = new Size();
	final static Size LARGE = new Size();
	
}
