package chap13;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class Sample06 {
	public static void main(String[] args) {
		int users = 14638;
		int views = 1500;
		NumberFormat cf = CompactNumberFormat.getCompactNumberInstance();
		
		System.out.println(cf.format(users));
		System.out.println(cf.format(views));
		System.out.println("===================================== 중국어");
		
		 Locale lo1 = Locale.CHINA;
		 NumberFormat cf1 = CompactNumberFormat.getCompactNumberInstance(lo1,Style.SHORT);
		 System.out.println(cf1.format(users));
		 System.out.println(cf1.format(views));
		 
		 
		 System.out.println("===================================== 영어");
		 Locale lo2 = Locale.ENGLISH;
		 cf1 = CompactNumberFormat.getCompactNumberInstance(lo2,Style.SHORT);//15K
		 System.out.println(cf1.format(users));
		 System.out.println(cf1.format(views));
		 
		 System.out.println("===================================== 일본어");
		 Locale lo3 = new Locale("jp","JP","JP");//2번째 인자는 국가코드, 3번재 인자는 방언유무
		 cf1 = CompactNumberFormat.getCompactNumberInstance(lo3,Style.SHORT);//15K
		 System.out.println(cf1.format(users));
		 System.out.println(cf1.format(views));
		 
		 System.out.println("===================================== 태국어");
		 Locale lo4= new Locale("th","TH","TH");//2번째 인자는 국가코드, 3번재 인자는 방언유무
		 cf1 = CompactNumberFormat.getCompactNumberInstance(lo4,Style.SHORT);//15K
		 System.out.println(cf1.format(users));
		 System.out.println(cf1.format(views));
		 
		 System.out.println("===================================== 노르웨이");
		 Locale lo5= new Locale("no","NO");//2번째 인자는 국가코드, 3번재 인자는 방언유무
		 cf1 = CompactNumberFormat.getCompactNumberInstance(lo5,Style.SHORT);//15K
		 System.out.println(cf1.format(users));
		 System.out.println(cf1.format(views));
	}
}
