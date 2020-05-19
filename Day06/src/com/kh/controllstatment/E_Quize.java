package com.kh.controllstatment;

import java.util.Scanner;

public class E_Quize {
	Scanner sc = new Scanner(System.in);

	public void Quize01() {
		// 월과 기온을 사용자로부터 입력받아
		// 계절과 주의보를 출력하는 코드를 작성하시오
		// 12, 1, 2 : 겨울
		// (기온이 -15도 이하일 경우 한파경보)
		// (기온이 -12도 이하일 경우 한파주의보)
		// 3, 4, 5 : 봄
		// 6, 7, 8 : 여름
		// (기온이 35도 이상일 경우 폭염경보)
		// (기온이 33도 이상일 경우 폭염주의보)
		// 9, 10, 11 : 가을
		int month;
		double temp;

		System.out.println("월을 입력하세요. : ");
		while (true) {
			try {
				month = sc.nextInt();
				if (month >= 1 && month <= 12)
					break;
				else {
					System.out.println("잘못입력하셨습니다. 1~12 사이의 값을 다시 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다. 1~12 사이의 값을 다시 입력하세요..");
				sc = new Scanner(System.in);
			}
		}
		System.out.println("현재 기온을 입력하세요.");
		while (true) {
			try {
				temp = sc.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("잘못입력하셨습니다. 실수만 입력할 수 있습니다. 다시 입력해주세요.");
				sc = new Scanner(System.in);
			}
		}

		String season = "";
		String warn = "";

		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			if (temp <= -15) {
				warn = "한파 경보";
			} else if (temp <= -12) {
				warn = "한파 주의보";
			}
			break;
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			if (temp >= 35) {
				warn = "폭염 경보";
			} else if (temp >= 33) {
				warn = "폭염 주의보";
			}
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		System.out.println("입력하신" + month + "월은" + season + "이고,");
		if (warn.isEmpty()) {
			System.out.println("입력하신 기온은" + temp + "'c 입니다.");
		} else {
			System.out.println("입력하신 기온은" + temp + "'c 이며 현재" + warn + "가 발령되었습니다.");
		}
	}
}
