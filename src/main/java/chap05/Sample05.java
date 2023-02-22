package chap05;

public class Sample05 {
	public static void main(String[] args) {
		int household1;
		int household2;
		int household3;
		
		 //***
		 //* ==> 여기만 이렇게 재정의 가능 
		 //*** 
		 //***
		 //*** 
		int[][] household = new int[5][3];
		household[1] = new int[1];
		
		System.out.printf("1층 %d세대\n",household[0].length);
		System.out.printf("2층 %d세대\n",household[1].length);
		System.out.printf("3층 %d세대\n",household[2].length);
		System.out.printf("4층 %d세대\n",household[3].length);
		System.out.printf("5층 %d세대\n",household[4].length);
	}
}
