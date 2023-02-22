package chap10.practice;

import java.util.Arrays;

import lombok.Getter;
import lombok.ToString;

public class Test2 {
    public static void main(String[] args) {
//    	기존의 배열에서는 String[]이나 Integer[]를 이용해서 특정 클래스에 대한 객체 배열을 만들었습니다.
//    	이번에는 CustomList라는 클래스를 제네릭 타입을 이용하여 String이나 Integer 등을 담는 배열로 사용할 수 있게 
//    	구현하고 각 클래스별로 배열을 담아서 출력하는 프로그램을 작성하세요.
    	
    	CustomList<String> cl1 = new CustomList<>();
    	cl1.add("빵형");
    	cl1.add("박형");
    	cl1.add("김형");
    	System.out.println(cl1.toString());
    	
    	CustomList<Integer> cl2 = new CustomList<>();
    	cl2.add(1);
    	cl2.add(2);
    	cl2.add(3);
    	System.out.println(cl2.toString());
    }
}

class CustomList<T>{
	private int arrCnt = 0;
	
	@Getter
	private T[] typeArr = (T[]) new Object[arrCnt];
	
	public void add (T element) {
		typeArr = Arrays.copyOf(typeArr, ++arrCnt);
		typeArr[arrCnt-1] = element;
	}

	@Override
	public String toString() {
		return "CustomList = "+ Arrays.toString(typeArr);
	}
}