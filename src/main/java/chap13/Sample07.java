package chap13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Sample07 {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년 MM월 dd일 E HH시 mm분 ss초");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY년 MM월 dd일 EEEEE a HH시 mm분 ss초");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd EEEEE a HH:mm:ss",new Locale("en","US"));
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("YYYY-MM-dd EEEEE a HH:mm:ss",Locale.ENGLISH);
		System.out.println(sdf4.format(date));
	}
}
