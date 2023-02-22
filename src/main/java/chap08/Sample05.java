package chap08;

public class Sample05 {
	
	static int sum;
	
	public static void main(String[] args) {
		System.out.println(sum(10));
	}
	
	public static int sum(int a) {
		sum += a;
		if(a == 0) {
			return sum;
		}else {
			return sum(--a);
		}
	}
	
	/*
	  //메소드 구조
	  [접근 제어자] [반환 자료형] 메소드 명([매개변수]){
	  
	  }
	  
	  //생성자 구조
	  [접근 제어자] 클래스 명{
	  
	  }
	  [접근 제어자] 클래스 명{
	  
	  }
	*/
}
