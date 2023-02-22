package chap13;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Sample14 {
	public static void main(String[] args) {
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		System.out.println(format1.format(ZonedDateTime.now()));
		
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss vvvv");
		System.out.println(format2.format(ZonedDateTime.now()));
		
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss VV");
		System.out.println(format3.format(ZonedDateTime.now()));
		
		DateTimeFormatter format4 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		System.out.println(format4.format(ZonedDateTime.now()));
	}
}
