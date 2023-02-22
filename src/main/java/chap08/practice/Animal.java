package chap08.practice;

public class Animal {
	
	String kind = "포유류";
	
	public class cat{

		int legsCnt;
		String name;
		public void printCatInfo() {
			System.out.printf("고양이는 %s 이고, ",kind);
			System.out.printf("고양이의 다리는 %d 개입니다.\n",legsCnt);
			System.out.printf("고양이의 이름은 %s 입니다.",name);
		}
	}
}
