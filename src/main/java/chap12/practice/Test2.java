package chap12.practice;

public class Test2 {
    public static void main(String[] args) {
//    	사계절을 enum 클래스에 입력한 후에 반복문을 통해서 사계절의 내용을 다음과 같이 출력하세요.
    	/*
	    	SPRING
	    	봄(Spring)
	    	SUMMER
	    	여름(Summer)
	    	FALL
	    	가을(Fail)
	    	WINTER
	    	겨울(Winter)
    	*/
    	SEASON[] seasons = SEASON.values();
    	for(SEASON season : seasons) {
    		System.out.println(season);
    		if(SEASON.SPRING.equals(season)) 
    			System.out.println("봄(Spring)");
    		else if (SEASON.SUMMER.equals(season)) 
    			System.out.println("여름(Summer)");
    		else if (SEASON.FALL.equals(season))
    			System.out.println("가을(Fail)");
    		else if (SEASON.WINTER.equals(season))
    			System.out.println("겨울(Winter)");
    	}
    }
}

enum SEASON{
	SPRING, SUMMER, FALL, WINTER;
}