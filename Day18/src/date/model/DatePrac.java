package date.model;

import java.util.GregorianCalendar;

public class DatePrac {

	public long dDay(int year, int month, int day) {

		long res = 0L;

		GregorianCalendar before = new GregorianCalendar();
		GregorianCalendar after = new GregorianCalendar();
		after.set(year, month - 1, day); // month - 1 ����� �Ѵ�.
		long between = after.getTimeInMillis() - before.getTimeInMillis();
		res = between / 1000; // ���� ���Ҵ���? 
		res = res / 60; // ���?
		res = res / 60; // ��ð�?
		res = res / 24; // ���� ���Ҵ���?
		return res;
	}

}
