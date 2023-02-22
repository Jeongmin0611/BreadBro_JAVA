package chap08.Sample23;

import java.util.Arrays;

import lombok.Data;

@Data
public class Car {
	
	private String	color;			//차량색상
	
	private int	door;			//문 수
	
	private String	manufacturer;	//제조사	
	
	public static void main(String[] args) {
		String[] str = {"a","b"};
		Arrays.stream(str).map(s -> s + '.').forEach(System.out::println);
	}
}
