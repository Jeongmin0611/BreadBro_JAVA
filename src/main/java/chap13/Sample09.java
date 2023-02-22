package chap13;

import java.time.LocalTime;

public class Sample09 {
	public static void main(String[] args) {
		 LocalTime now = LocalTime.now();
		 System.out.println(now);
		 System.out.printf("%02d:%02d:%02d \n",now.getHour(), now.getMinute(), now.getSecond());
		 
		 LocalTime lt = LocalTime.parse("08:10:10");
		 System.out.println(lt);
		 
		 LocalTime lt2 = LocalTime.of(19, 20, 2);
		 System.out.println("기준 : "+ lt2);
		 System.out.println("10초 뒤 : "+ lt2.plusSeconds(10));
		 System.out.println("10초 전 : "+ lt2.minusMinutes(10));
		 System.out.println("기준 : "+ lt2);
	}
}
