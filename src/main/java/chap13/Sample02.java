package chap13;

import java.util.Calendar;
import java.util.Date;

import javax.sound.midi.InvalidMidiDataException;

public class Sample02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		
		System.out.println("== Date ==");
		System.out.printf("%s %s %d %02d:%02d:%02d KST %d \n",
							getWeekName(1),//1부터 일요일
							getMonthName(1),//0부터 1월
							date.getDate(),
							date.getHours(),
							date.getMinutes(),
							date.getSeconds(),
							date.getYear()+ 1900);
		
		System.out.println("== Calendar ==");
		System.out.printf("%s %s %d %02d:%02d:%02d KST %d",
				getWeekName(cal.get(Calendar.DAY_OF_WEEK)),//1부터 일요일
				getMonthName(cal.get(Calendar.MONTH)),//0부터 1월
				cal.get(Calendar.DAY_OF_MONTH),
				cal.get(Calendar.HOUR_OF_DAY),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND),
				cal.get(Calendar.YEAR));
	}
	
	public static String getWeekName(int weekNum) {
		return (switch(weekNum) {
			case Calendar.SUNDAY -> "Sun";
			case Calendar.MONDAY -> "Mon";
			case Calendar.TUESDAY -> "Tue";
			case Calendar.WEDNESDAY -> "Wed";
			case Calendar.THURSDAY -> "Thu";
			case Calendar.FRIDAY -> "Fri";
			case Calendar.SATURDAY -> "Sat";
			default -> "없음";
		});
	}
	
	public static String getMonthName(int monthNum) {
		return (switch(monthNum) {
			case Calendar.JANUARY -> "Jan";
			case Calendar.FEBRUARY -> "Feb";
			case Calendar.MARCH -> "Mar";
			case Calendar.APRIL -> "Apr";
			case Calendar.MAY -> "May";
			case Calendar.JUNE -> "Jun";
			case Calendar.JULY -> "Jul";
			case Calendar.AUGUST -> "Aug";
			case Calendar.SEPTEMBER -> "Sep";
			case Calendar.OCTOBER -> "Oct";
			case Calendar.NOVEMBER -> "Nov";
			case Calendar.DECEMBER -> "Dec";
			default -> "없음";
		});
	}
}
