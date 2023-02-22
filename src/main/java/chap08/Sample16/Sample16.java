package chap08.Sample16;

public class Sample16 extends Object{

	public static void main(String[] args) {
		String a = new String("빵형");
		String b = "빵형";
		String c = "빵형";
		String d = new String("빵형");
		
		if(a == b) {
			System.out.println("a와 b는 주소가 같습니다.");
		}else {
			System.out.println("a와 b는 다른 주소입니다.");
		}
		
		if(a.equals(b)) {
			System.out.println("a와 b는 같은 값 입니다.");
		}else {
			System.out.println("a와 b는 서로 다른 값 입니다.");
		}
		
		
		
		if(b == c) {
			System.out.println("b와 c는 주소가 같습니다.");
		}else {
			System.out.println("b와 c는 다른 주소입니다.");
		}
		
		if(b.equals(c)) {
			System.out.println("b와 c는 같은 값 입니다.");
		}else {
			System.out.println("b와 c는 서로 다른 값 입니다.");
		}
		
		System.out.printf("%s%s%s%s",a,b,c,d);
	}

}
