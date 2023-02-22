package chap08.Sample03;

public class Sample03 {
	public static void main(String[] args) {
		Data data = new Data();// 같은 package안에 있는 클래스는 IMPORT시키지 않고 쓸수 있음.
		data.setValue(10);
		System.out.println(data.getValue());
		
		Compute cmpt = new Compute();
		cmpt.setValue(4);
		cmpt.setValue(10,2);
		System.out.println(cmpt.getValue());
		System.out.println("빵형");
		System.out.println(1.5F);
		System.out.println(1.6);
	}
}
