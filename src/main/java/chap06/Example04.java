package chap06;

public class Example04 {
	public static void main(String[] args) {
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (i+1)+i; k++) {
				System.out.print("*");
			}
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
