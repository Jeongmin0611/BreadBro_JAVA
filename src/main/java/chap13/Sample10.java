package chap13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Sample10 {
	public static void main(String[] args) {
		Date date = new Date();
		LocalDateTime local = LocalDateTime.now();
		System.out.println(date);
		System.out.println(local);
		
		//연산
		date.setMonth(date.getMonth()+3);
		//local.plusMonths(3); local 안에있는 날짜 데이터가 바뀌지 않음.
		
		//출력
		System.out.println("date ====> "+date);
		System.out.println("local ======> "+local.plusMonths(3));
		
		//원하는 국가의 날짜/시간 정보
		LocalDateTime local2 = LocalDateTime.now(ZoneId.of("Asia/Colombo"));
		System.out.println(local2);
		System.out.println("================================================================");
		
		ZoneId.getAvailableZoneIds()
			  .stream()
			  .forEach(System.out::println);
	}
}
