package tour_teacher.veiw;

import java.util.Scanner;

import tour_teacher.controller.TourController;

public class MainMenu {

	Scanner sc = new Scanner(System.in);

	private TourController tc = new TourController();

	{
		System.out.println("******KH항공사에 오신 고객님 환영합니다******");
	}

	public MainMenu() {

	}

	public void mainMenu() {

		boolean b = true;
		while (b) {

			System.out.println("현재 보유 금액 : " + tc.bringMyMoney());

			System.out.println("현재 보유 마일리지 : " + tc.bringMyMile());

			System.out.println("번호   목적지   가격   마일리지");
			System.out.println("1   미국행   300000   3000");
			System.out.println("2   중국행   200000   2000");
			System.out.println("3   일본행   150000   1500");
			System.out.println("목적지 선택(번호입력) : ");
			int num = sc.nextInt();

			// 객체배열 사용후 변경
			if (tc.isAble(num)) {
				// 객체배열 사용후 변경
				tc.buyTicket(num);
				System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
				System.out.println("티케팅 후 마일리지는 : " + tc.bringMyMile());
			} else {
				System.out.println("보유금액이 부족합니다.");
				b = false;
			}

			//
			// 객체배열 사용후 생략
			// switch (num) {
			// case 1:
			// if (tc.isAble(num)) {
			// // 객체배열 사용후 변경
			// tc.buyTicket(num);
			// System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
			// System.out.println("티케팅 후 마일리지는 : " + tc.bringMyMile());
			//
			// } else {
			// System.out.println("보유금액이 부족합니다.");
			// b = false;
			// }
			// break;
			//
			// case 2:
			// if (tc.isAble(num)) {
			// tc.buyTicket(num);
			// System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
			// System.out.println("티케팅 후 마일리지는 : " + tc.bringMyMile());
			// } else {
			// System.out.println("보유금액이 부족합니다.");
			// b = false;
			// }
			// break;
			//
			// case 3:
			// if (tc.isAble(num)) {
			// tc.buyTicket(num);
			// System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
			// System.out.println("티케팅 후 마일리지는 : " + tc.bringMyMile());
			// } else {
			// System.out.println("보유금액이 부족합니다.");
			// b = false;
			// }
			// break;
			// }

		}

	}
}
