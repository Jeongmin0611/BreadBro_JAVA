package chap08;

public class Sample12 {
	public static void main(String[] args) {
		//Runnable 클래스를 이용한 익명 내부 클래스 생성
		Runnable r = new Runnable(){

			@Override
			public void run() {
				System.out.println("익명 내부 클래스를 실행합니다.");
			}
			
		};
		r.run();
	}
}
