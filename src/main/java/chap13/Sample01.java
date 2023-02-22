package chap13;

import java.util.Calendar;
import java.util.Date;

public class Sample01 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("CALENDAR 클래스 ===> "+cal.getTime());
		
		Date date = new Date();
		System.out.println("Date 클래스 ===> "+date);
		System.out.println("Date 클래스 ===> "+date.getDay());
		System.out.println("CALENDAR 클래스 ===> "+cal.SUNDAY);
	}
}
