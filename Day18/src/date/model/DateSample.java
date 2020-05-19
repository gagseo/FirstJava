package date.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateSample {

	// Date
	// Date클래스는 자바 초기에 만들어져서 완성도가 낮다.
	// 다국적으로 쓰기에 적합하지 않다.
	// 기준시간이 1970년 1월 1일 0시 0분 0초 이다.
	// Date는 년도 +1900, 월은 +1을 내부적으로 해줘야 한다.

	public void date() {

		Date today = new Date(); // 현재시간
		System.out.println(today);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd E요일"); // API문서 보면 다른 표현 방식 확인가능
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html
		System.out.println(sdf.format(today));

		// 시간에 대해 원하는것 뽑아보기
		// 연월일시분초
		System.out.println("Date클래스 연도 :" + (today.getYear() + 1900));
		System.out.println("Date클래스 월 :" + (today.getMonth() + 1));
		System.out.println("Date클래스 일 :" + today.getDate());
		System.out.println("Date클래스 시 :" + today.getHours());
		System.out.println("Date클래스 분 :" + today.getMinutes());
		System.out.println("Date클래스 초 :" + today.getSeconds());
		System.out.println("Date클래스 요일 :" + today.getDay());
	}

	public void calendarSamlpe() {

		System.out.println("------------캘린더-----------");
		// 2. Calendar
		// 월만 +1을 해주면 된다(년도 직접입력 ex) 19라고 적으면 그냥 19년도 인식
		// field number개념이 도입
		// 추상클래스 -> getInstance

		Calendar calendar = Calendar.getInstance();
		if (calendar instanceof GregorianCalendar) {
			System.out.println("Calendar클래스의 인스턴스는 GregorianCalendar의 인스턴스 입니다.");
		}
		Calendar calendar2 = Calendar.getInstance();
		Date today = new Date(); // 기억
		calendar2.setTime(today);

		System.out.println("==========calendar1========");
		System.out.println(calendar.getTime());
		System.out.println("calendar 년 : " + calendar.get(Calendar.YEAR));
		System.out.println("calendar 월 : " + calendar.get(Calendar.MONTH));
		System.out.println("calendar 일 : " + calendar.get(Calendar.DATE));
		System.out.println("calendar 시 : " + calendar.get(Calendar.HOUR));
		System.out.println("calendar 분 : " + calendar.get(Calendar.MINUTE));
		System.out.println("calendar 초 : " + calendar.get(Calendar.SECOND));
		System.out.println("calendar 요일: " + calendar.get(Calendar.DAY_OF_WEEK));

		System.out.println("==========calendar2========");
		System.out.println(calendar2.getTime());
		System.out.println("calendar2 년 : " + calendar2.get(Calendar.YEAR));
		System.out.println("calendar2 월 : " + calendar2.get(Calendar.MONTH));
		System.out.println("calendar2 일 : " + calendar2.get(Calendar.DATE));
		System.out.println("calendar2 시 : " + calendar.get(Calendar.HOUR));
		System.out.println("calendar2 분 : " + calendar2.get(Calendar.MINUTE));
		System.out.println("calendar2 초 : " + calendar2.get(Calendar.SECOND));
		System.out.println("calendar2 요일: " + calendar2.get(Calendar.DAY_OF_WEEK));

	}

	public void gregorianCalendar() {

		System.out.println("----------GregorianCalendar---------");
		GregorianCalendar gr = new GregorianCalendar();

		System.out.println(gr.getTime());
		System.out.println("GregorianCalendar 년 : " + gr.get(Calendar.YEAR));
		System.out.println("GregorianCalendar 월 : " + gr.get(Calendar.MONTH));
		System.out.println("GregorianCalendar 일 : " + gr.get(Calendar.DATE));
		System.out.println("GregorianCalendar 시 : " + gr.get(Calendar.HOUR));
		System.out.println("GregorianCalendar 분 : " + gr.get(Calendar.MINUTE));
		System.out.println("GregorianCalendar 초 : " + gr.get(Calendar.SECOND));
		System.out.println("GregorianCalendar 요일: " + gr.get(Calendar.DAY_OF_WEEK));

	}
}
