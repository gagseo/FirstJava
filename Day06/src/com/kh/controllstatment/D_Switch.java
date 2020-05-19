package com.kh.controllstatment;

import java.util.Scanner;

public class D_Switch {

	// 변수의 값을 case에서 찾아 명령을 수행하는 조건문이다.
	// (범위가 아니라 정확한 값이어야 한다. i < 10(x), i == 10(o)
	// 해당 값이 없을 경우 default문을 수행한다(if문의 else와 유사)
	// case와 명령문 사이에는 (:)을 써야한다.
	// break가 없으면 멈추지 않고 다음 case나 default를 수행한다.

	// [표현식]
	// switch(변수){
	// case 1 : 실행문; break; //변수의 값이 1일 경우 여기만 실행
	// case 2 : 실행문; break; //변수의 값이 2일 경우 여기만 실행
	// default : 실행문; break; //1도 2도 아니면 여기 실행
	Scanner sc = new Scanner(System.in);

	public void testSwitch1() {

		// 정수를 하나 입력받은 뒤 입력받은 숫자가 짝수인지 홀수인지 판별

		System.out.println("정수를 하나 입력하세요.");
		int num = sc.nextInt();
		int res = num % 2;
		switch (res) {
		case 0:
			System.out.println("입력하신 정수는 짝수 입니다.");
			break;
		default:
			System.out.println("입력하신 정수는 홀수 입니다.");
		}
	}

	// 스위치문 안에 if문 작성
	public void testSwitch2() {
		// 하나의 정수를 입력받은뒤
		// 해당 정수가 0인지 짝수인지 홀수인지 출력하는
		// switch문을 작성하시오

		System.out.println("정수를 하나 입력하세요.");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			if (num != 0) {
				System.out.println("입력하신 정수는 짝수입니다.");
			} else {
				System.out.println("입력하신 정수는 0입니다.");
			}
			break;
		default:
			System.out.println("입력하신 정수는 홀수입니다.");
		}
	}

	// Switch문 안에 switch문 넣어서 사용
	public void testSwitch3() {
		System.out.println("정수를 하나 입력하세요.");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("입력하신 정수는 0입니다.");
				break;
			default:
				System.out.println("입력하신 정수는 짝수입니다.");
			}
			break;
		default:
			System.out.println("입력하신 정수는 홀수입니다.");
		}
	}

	// break문 삭제해보기
	// Fall Through
	// 활용할 수는 있지만 가독성이 떨어진다.
	// 만약에 사용한다면 주석을 필수로 달아줘야 한다.
	public void testSwitch4() {
		System.out.println("정수를 하나 입력하세요.");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			switch (num) {
			case 0:
				System.out.println("입력하신 정수는 0입니다.");
				// break;
			default:
				System.out.println("입력하신 정수는 짝수입니다.");
			}
			// break;
		default:
			System.out.println("입력하신 정수는 홀수입니다.");
		}
	}

	public void testIfQ() {
		// 회원등급(Dia/Gold/Sliver/Bronz)을 입력받은 다음
		// 등급에 따라 쿠폰을 발급해주는 프로그램을 작성하시오
		// Dia : 다이아쿠폰/50%할인쿠폰/영화티켓2매쿠폰/20%할인쿠폰
		// Gold : 다이아쿠폰/50%할인쿠폰/영화티켓2매쿠폰
		// Silver : 다이아쿠폰/50%할인쿠폰
		// Bronz : 다이아쿠폰
		// 쿠폰 발급은 "00쿠폰 발급" 이라고 출력할 경우 발급되었다고 간주.
		// if문을 활용해서 작성해야합니다.
		// if문으로 만든 다음 switch문으로 변경해보기
		System.out.println("등급을 입력하세요 : ");
		String mg = "";
		mg = sc.nextLine();
		// 조건문 작성시, mg == "Dia" 이렇게 작성하지말고
		// 아래 조건문 처럼 작성해줘야 합니다. 의미는 같습니다.

		if (mg.equals("Dia")) {
			System.out.println("다이아 쿠폰발급");
			System.out.println("50%할인 쿠폰발급");
			System.out.println("영화티켓 2매쿠폰발급");
			System.out.println("20%할인 쿠폰발급");
		} else if (mg.equals("Gold")) {
			System.out.println("다이아 쿠폰발급");
			System.out.println("50%할인 쿠폰발급");
			System.out.println("영화티켓 2매쿠폰발급");
		} else if (mg.equals("Sliver")) {
			System.out.println("다이아 쿠폰발급");
			System.out.println("50%할인 쿠폰발급");
		} else if (mg.equals("Bronze")) {
			System.out.println("다이아 쿠폰발급");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}

	}

	public void testSwitchO() {
		System.out.println("등급을 입력하세요 : ");
		String mg = sc.nextLine();

		switch (mg) {
		case "Dia":
			System.out.println("20%할인쿠폰발급");
		case "Gold":
			System.out.println("영화티켓 2매발급");
		case "Sliver":
			System.out.println("50%할인 쿠폰발급");
		case "Bronze":
			System.out.println("다이아 쿠폰발급");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	// 1~12월까지 입력 받아, 해다하는 달의 마지막 날짜를 출력하세요.
	// default문을 제외하고 출력문 4개로 작성할 수 있습니다.
	public void switchQ2() {
		System.out.println("1~12월중 하나를 입력하세요 : ");
		String month = sc.nextLine();
		switch (month) {
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
			System.out.println("31일");
			break;
		case "4":
		case "6":
		case "9":
		case "11":
			System.out.println("30일");
			break;
		case "2":
			System.out.println("28일");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

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

	public void ifQuize() {
		System.out.println("월 과 기온을 입력하세요.");
		String month = sc.nextLine();
		int temp = sc.nextInt();

		switch (month) {
		case "12월":
		case "1월":
		case "2월":
			if (temp <= -15) {
				System.out.println("한파경보");

			} else if (temp <= -12) {
				System.out.println("한파주의보");
			}
			System.out.println("겨울");
			break;
		case "3월":
		case "4월":
		case "5월":
			System.out.println("봄");
			break;
		case "6월":
		case "7월":
		case "8월":
			if (temp >= 35) {
				System.out.println("폭염경보");
			} else if (temp >= 33) {
				System.out.println("폭염주의보");
			}
			System.out.println("여름");
			break;
		case "9월":
		case "10월":
		case "11월":
			System.out.println("가을");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}

	}

	// 두 개의 정수를 입력받고, 문자 혹은 문자열로 연산기호(+, -, *, /, %)를
	// 입력 받아 연산의 수행결과를 출력하시오.
	// -연산의 경우 0 이상의 값이 나오도록 계산하세요.

	// 첫 번째 정수 입력 : 5
	// 두 번째 정수 입력 : 7
	// 연산 기호 입력 : *
	// 수행 결과 : 5 * 7 = 35

	// 단, 0으로 나눌 경우 "0으로 나눌 수 없습니다"를 출력하고 결과 값을 0으로 처리하며
	// 연산 기호에 없는 문자를 입력하면"입력하신 연산은 없습니다. 프로그램을 종료합니다."를
	// 출력 후 프로그램을 종료하시오.
	public void ifQuize2() {
		System.out.println("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		System.out.println("연산 기호를 입력하세요.[+, -, *, /, %] : ");
		char c = sc.nextLine().charAt(0);

		if (c == '+') {
			if (num1 + num2 >= 0) {
				System.out.println(num1 + num2);
			} else if (c == '-') {
				if (num1 - num2 >= 0) {
					System.out.println(num1 - num2);
				}
			} else if (c == '*') {
				if (num1 * num2 >= 0) {
					System.out.println(num1 * num2);
				}
			} else if (c == '/') {
				if (num2 != 0 && num1 / num2 >= 0) {
					System.out.println(num1 / num2);
				} else {
					System.out.println("0으로 나눌수 없습니다.");
				}
			} else if (c == '%') {
				System.out.println(num1 % num2);
			} else {
				System.out.println("입력하신 연산은 없습니다.");

			}
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
