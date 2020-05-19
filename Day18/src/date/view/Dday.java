package date.view;

import java.util.Scanner;

import date.model.DatePrac;

public class Dday {

	DatePrac dp = new DatePrac();

	public void mainMenu() {

		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.");
		System.out.println("연도 : ");
		int year = sc.nextInt();
		System.out.println("월 : ");
		int month = sc.nextInt();
		System.out.println("일 : ");
		int day = sc.nextInt();

		long res = dp.dDay(year, month, day);
		System.out.println("입력하신 날짜까지 " + res + "일 남았습니다.");
		System.out.println(dp.dDay(year, month, day) + "일 남았습니다."); // 출력문 안에 작성가능하다.

	}

}
