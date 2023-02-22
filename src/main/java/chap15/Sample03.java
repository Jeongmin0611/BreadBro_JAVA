package chap15;

public class Sample03 {
	public static void main(String[] args) {
		//대상 문자열
		String[] str = {"asdf12", "123456", "qwerty", "as45we", "2345AS", "A"};
		
		String rex = "^[A-Z0-9]{6}$";
		
		for(String data : str) {
			System.out.printf("%s\t%b\n",data,data.matches(rex));
		}
	}
}
