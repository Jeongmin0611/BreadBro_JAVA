package chap13;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Sample11 {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("* 시스템 현재 시간 ==> "+ldt);
		
		ZoneId zi1 = ZoneId.of("Asia/Seoul");
		ZoneId zi2 = ZoneId.of("Asia/Bangkok");
		ZoneId zi3 = ZoneId.of("Australia/Sydney");
		
		LocalDateTime ldt1 = LocalDateTime.now(zi1);
		System.out.println("\n1. LocalDateTime 서울 : "+ldt1);
		LocalDateTime ldt2 = LocalDateTime.now(zi2);
		System.out.println("2. LocalDateTime 방콕 : "+ldt2);
		LocalDateTime ldt3 = LocalDateTime.now(zi3);
		System.out.println("3. LocalDateTime 시드니 : "+ldt3);
		
		ZonedDateTime zdt1 = ZonedDateTime.now(zi1);
		ZonedDateTime zdt2 = ZonedDateTime.now(zi2);
		ZonedDateTime zdt3 = ZonedDateTime.now(zi3);
		System.out.println("\n1. ZonedDateTime 서울 : "+zdt1);
		System.out.println("2. ZonedDateTime 방콕 : "+zdt2);
		System.out.println("3. ZonedDateTime 시드니 : "+zdt3);
		System.out.println("3. ZonedDateTime 서울 : "+zdt3.withZoneSameInstant(zi1));
		System.out.println("\n1. ZonedDateTime 서울 : "+zdt1);
		
		
	}
}
