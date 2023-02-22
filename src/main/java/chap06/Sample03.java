package chap06;

public class Sample03 {
	public static void main(String[] args) {
		String str = "hello, Java";
		
		char[] chr = str.toCharArray();
		
		System.out.println(chr.length);
		
		for(int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
		}
	}
}
