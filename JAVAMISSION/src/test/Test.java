package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(cal.DAY_OF_WEEK, 7);
		cal.set(cal.HOUR_OF_DAY, 22);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd일 (E) HH:mm:ss");
		String today = sdf.format(cal.getTime());
		
		System.out.println("지금 설정 시간 : "+ today);
		
		System.out.println(cal.get(cal.DAY_OF_YEAR));
		if (cal.get(cal.DAY_OF_WEEK)==7&&cal.get(cal.HOUR_OF_DAY)>=21) {
			cal.set(cal.DAY_OF_YEAR, (cal.get(cal.DAY_OF_YEAR)+5));
			cal.get(cal.DAY_OF_YEAR);			
		}
		System.out.println();
		cal.set(cal.DAY_OF_WEEK, 7);
		cal.set(cal.HOUR_OF_DAY, 21);
		cal.set(cal.MINUTE, 0);
		cal.set(cal.SECOND, 0);
		String Dday = sdf.format(cal.getTime());
		
		int year = cal.get(cal.YEAR);
		int day = cal.get(cal.DAY_OF_MONTH);
		cal.set(cal.YEAR, year + 1);
		cal.set(cal.DAY_OF_MONTH, day + 1);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd일 (E)");
		String dLine = sdf2.format(cal.getTime());

		System.out.println("############# 인생역전 Lottoria ############");
		System.out.println("발행일\t\t: " + today);
		System.out.println("추첨일\t\t: " + Dday);
		System.out.println("지급기한\t\t: " + dLine);
	}
}
