package chap13;

import java.time.LocalDate;

public class Sample08 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate ld =  LocalDate.parse("1945-08-15");
		System.out.println(ld);
		
		LocalDate ld2 = LocalDate.parse("2020-06-03");
		System.out.printf("%d년은 %s입니다. \n",ld2.getYear(),(ld2.isLeapYear() ? "윤년" : "평년"));
		System.out.printf("오늘은 %s일 입니다. \n",now.getDayOfMonth());
		
		System.out.printf("1년 전 날짜는 %s 입니다.",now.minusYears(1));
	}
}
