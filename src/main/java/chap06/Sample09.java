package chap06;

public class Sample09 {
	public static void main(String[] args) {
		String str = "Hello Java";
		char[] chr = str.toCharArray();
		for(char c : chr) {
			System.out.print(c);
		}
		System.out.println();
	}
}
