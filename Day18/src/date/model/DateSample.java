package date.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateSample {

	// Date
	// DateŬ������ �ڹ� �ʱ⿡ ��������� �ϼ����� ����.
	// �ٱ������� ���⿡ �������� �ʴ�.
	// ���ؽð��� 1970�� 1�� 1�� 0�� 0�� 0�� �̴�.
	// Date�� �⵵ +1900, ���� +1�� ���������� ����� �Ѵ�.

	public void date() {

		Date today = new Date(); // ����ð�
		System.out.println(today);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd E����"); // API���� ���� �ٸ� ǥ�� ��� Ȯ�ΰ���
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html
		System.out.println(sdf.format(today));

		// �ð��� ���� ���ϴ°� �̾ƺ���
		// �����Ͻú���
		System.out.println("DateŬ���� ���� :" + (today.getYear() + 1900));
		System.out.println("DateŬ���� �� :" + (today.getMonth() + 1));
		System.out.println("DateŬ���� �� :" + today.getDate());
		System.out.println("DateŬ���� �� :" + today.getHours());
		System.out.println("DateŬ���� �� :" + today.getMinutes());
		System.out.println("DateŬ���� �� :" + today.getSeconds());
		System.out.println("DateŬ���� ���� :" + today.getDay());
	}

	public void calendarSamlpe() {

		System.out.println("------------Ķ����-----------");
		// 2. Calendar
		// ���� +1�� ���ָ� �ȴ�(�⵵ �����Է� ex) 19��� ������ �׳� 19�⵵ �ν�
		// field number������ ����
		// �߻�Ŭ���� -> getInstance

		Calendar calendar = Calendar.getInstance();
		if (calendar instanceof GregorianCalendar) {
			System.out.println("CalendarŬ������ �ν��Ͻ��� GregorianCalendar�� �ν��Ͻ� �Դϴ�.");
		}
		Calendar calendar2 = Calendar.getInstance();
		Date today = new Date(); // ���
		calendar2.setTime(today);

		System.out.println("==========calendar1========");
		System.out.println(calendar.getTime());
		System.out.println("calendar �� : " + calendar.get(Calendar.YEAR));
		System.out.println("calendar �� : " + calendar.get(Calendar.MONTH));
		System.out.println("calendar �� : " + calendar.get(Calendar.DATE));
		System.out.println("calendar �� : " + calendar.get(Calendar.HOUR));
		System.out.println("calendar �� : " + calendar.get(Calendar.MINUTE));
		System.out.println("calendar �� : " + calendar.get(Calendar.SECOND));
		System.out.println("calendar ����: " + calendar.get(Calendar.DAY_OF_WEEK));

		System.out.println("==========calendar2========");
		System.out.println(calendar2.getTime());
		System.out.println("calendar2 �� : " + calendar2.get(Calendar.YEAR));
		System.out.println("calendar2 �� : " + calendar2.get(Calendar.MONTH));
		System.out.println("calendar2 �� : " + calendar2.get(Calendar.DATE));
		System.out.println("calendar2 �� : " + calendar.get(Calendar.HOUR));
		System.out.println("calendar2 �� : " + calendar2.get(Calendar.MINUTE));
		System.out.println("calendar2 �� : " + calendar2.get(Calendar.SECOND));
		System.out.println("calendar2 ����: " + calendar2.get(Calendar.DAY_OF_WEEK));

	}

	public void gregorianCalendar() {

		System.out.println("----------GregorianCalendar---------");
		GregorianCalendar gr = new GregorianCalendar();

		System.out.println(gr.getTime());
		System.out.println("GregorianCalendar �� : " + gr.get(Calendar.YEAR));
		System.out.println("GregorianCalendar �� : " + gr.get(Calendar.MONTH));
		System.out.println("GregorianCalendar �� : " + gr.get(Calendar.DATE));
		System.out.println("GregorianCalendar �� : " + gr.get(Calendar.HOUR));
		System.out.println("GregorianCalendar �� : " + gr.get(Calendar.MINUTE));
		System.out.println("GregorianCalendar �� : " + gr.get(Calendar.SECOND));
		System.out.println("GregorianCalendar ����: " + gr.get(Calendar.DAY_OF_WEEK));

	}
}
