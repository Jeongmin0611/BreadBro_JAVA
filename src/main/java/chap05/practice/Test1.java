package chap05.practice;

public class Test1 {
    public static void main(String[] args) {
//    	 어느 고등학교의 학생 수만큼의 정수 자료형으로 배열을 만들어 보세요.
		/*
		 * 1학년은 1반부터 3반까지 있습니다. 1반은 12명, 2반 12명, 3반은 12명이 있습니다. 
		 * 2학년은 1반부터 3반까지 있습니다. 1반은 9명, 2반 12명, 3반은 10명이 있습니다. 
		 * 3학년은 1반부터 3반까지 있습니다. 1반은 7명, 2반 12명, 3반은 11명이 있습니다. 
		 * 1학년 1반 12명 
		 * 1학년 2반 12명 
		 * 1학년 3반 12명 
		 * 2학년 1반 9명 
		 * 2학년 2반 12명 
		 * 2학년 3반 10명 
		 * 3학년 1반 7명 
		 * 3학년 2반 12명 
		 * 3학년 3반 11명
		 */
    	 int[][][] school = new int[3][3][12];
    	 school[1][0] = new int[9];
    	 school[1][2] = new int[10];
    	 school[2][0] = new int[7];
    	 school[2][2] = new int[11];
    	 
    	 System.out.printf("1학년 1반 %d명\n",school[0][0].length);
    	 System.out.printf("1학년 2반 %d명\n",school[0][1].length);
    	 System.out.printf("1학년 3반 %d명\n",school[0][2].length);
    	 
    	 System.out.printf("2학년 1반 %d명\n",school[1][0].length);
    	 System.out.printf("2학년 2반 %d명\n",school[1][1].length);
    	 System.out.printf("2학년 3반 %d명\n",school[1][2].length);
    	 
    	 System.out.printf("3학년 1반 %d명\n",school[2][0].length);
    	 System.out.printf("3학년 2반 %d명\n",school[2][1].length);
    	 System.out.printf("3학년 3반 %d명\n",school[2][2].length);
    	 
    }
}
