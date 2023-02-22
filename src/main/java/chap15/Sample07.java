package chap15;

public class Sample07 {
	public static void main(String[] args) {
		//대상 문자열
		String[] str = {"ASDF12", "123456", "qwerty", "as45aa", "123456jkl", 
				"010-1234-5678", "1234개"};
		
		String regex = "[^0-9]";
		
		for(String data : str) {
			System.out.printf("%s \t %s \n",data,data.replaceAll(regex, ""));
		}
	}
}
