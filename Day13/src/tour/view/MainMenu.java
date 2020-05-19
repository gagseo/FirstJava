package tour.view;

import java.util.Scanner;

import tour.controller.TourController;
import tour.model.vo.Tourist;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	private TourController tc = new TourController();

	{
		System.out.println("******KH항공사에 오신 고객님 환영합니다******");
	}

	public MainMenu() {

	}

	public void mainMenu() { // 막혔던 부분

		boolean cont = true;

		System.out.println("현재 보유 금액 : " + tc.bringMyMoney());

		System.out.println("현재 보유 마일리지 : " + tc.bringMyMil());
		// 메뉴 추후 작성 예정
		System.out.println("번호    목적지    가격    마일리지");
		System.out.println();

		do {

			// 아래부분 복습
			System.out.println("목적지 선택(번호입력) : ");
			int go = sc.nextInt();

			switch (go) {
			case 1:
				if (tc.isAble(tc.bringMyMoney())) {
					tc.buyTiket1();
				} else {
					System.out.println("현재 보유 금액이 부족합니다.");
				}
				break;
			case 2:
				if (tc.isAble(tc.bringMyMoney())) {
					tc.buyTiket2();
				} else {
					System.out.println("현재 보유 금액이 부족합니다.");
				}
				break;
			case 3:
				if (tc.isAble(tc.bringMyMoney())) {
					tc.buyTiket3();
				} else {
					System.out.println("현재 보유 금액이 부족합니다.");
				}
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			System.out.println("티케팅 후 잔액은 : " + tc.bringMyMoney());
			System.out.println("티케팅 후 마일리지는 : " + tc.bringMyMil());

		} while (cont);

	}

}
