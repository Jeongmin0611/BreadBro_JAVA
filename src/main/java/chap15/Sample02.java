package chap15;

public class Sample02 {
	public static void main(String[] args) {
		String str = "12345678901";
		String exp1 = "^[0-9]*$";
		
		//System.out.println(str.matches(exp1));
		if(!str.matches(exp1)) {
			System.out.println("숫자만 입력하세요.");
		}else {
			
		}
	}
}
