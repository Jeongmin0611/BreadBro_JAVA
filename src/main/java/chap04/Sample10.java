package chap04;

public class Sample10 {
	public static void main(String[] args) {
		//XOR : 서로 다르면 참, 같으면 거짓
		//		 						     8421
		int a = 60;	//0000 0000 0000 0000 0000 0000 0011 1100 0 -> 1 계산
		int b = -10;//1111 1111 1111 1111 1111 1111 1111 0110 1 -> 0 계산
		System.out.println("* XOR");
		System.out.printf("[%32s] %d%n",lpad(Integer.toBinaryString(a),32,"0"), a);
		System.out.printf("[%32s] %d%n",lpad(Integer.toBinaryString(b),32,"0"), b);
		System.out.println("===============================================");
		System.out.printf("[%32s] %d%n",lpad(Integer.toBinaryString(a ^ b),32,"0"), a ^ b);
	}
	//왼쪽 문자열 0으로 채움
	public static String lpad(String context, int len, String ch) {
		String str = context;
		if(context.length() < len) {
			for(int i = 0; i< len - context.length(); i++) {
				str = ch + str;
			}
		}
		return str;
	}
}
