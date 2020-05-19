package date.model;

import java.util.GregorianCalendar;

public class DatePrac {

	public long dDay(int year, int month, int day) {

		long res = 0L;

		GregorianCalendar before = new GregorianCalendar();
		GregorianCalendar after = new GregorianCalendar();
		after.set(year, month - 1, day); // month - 1 해줘야 한다.
		long between = after.getTimeInMillis() - before.getTimeInMillis();
		res = between / 1000; // 몇초 남았는지? 
		res = res / 60; // 몇분?
		res = res / 60; // 몇시간?
		res = res / 24; // 몇일 남았는지?
		return res;
	}

}
