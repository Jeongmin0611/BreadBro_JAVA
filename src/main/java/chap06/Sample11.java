package chap06;

public class Sample11 {
	public static void main(String[] args) {
		int i = 1;
		
		do {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		while(i <= 5);
	}
}
