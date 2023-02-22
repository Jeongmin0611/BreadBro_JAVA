package chap08.practice;

public class Test3_1 {

    public static void main(String[] args) {
    	//concat() 메소드에 문자열로 넘어오는 다수의 인자를 붙여서 한 줄로 출력하는 메소드를 완성하세요.
    	// *오버로딩 기능을 이용해서 작성하세요.
    	/*
	    	ex)
				concat("학교종이","땡땡땡");
				출력
				학교종이 땡떙떙
				
				concat("객체지향","패키지","클래스","객체","접근제어자","롬복");
				출력
				객체지향패키지클래스객체접근제어자롬복
    	*/
    	System.out.println(concat("학교종이","땡땡땡"));
    	System.out.println(concat("객체지향","패키지","클래스","객체","접근제어자","롬복"));
    }
    
    private static String concat(String... strArr) {
    	String str = "";
    	for(String s : strArr){
    		str += s;
    	}
    	return str;
    } 
}
