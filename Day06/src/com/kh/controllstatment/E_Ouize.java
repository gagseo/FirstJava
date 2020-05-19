package com.kh.controllstatment;

import java.util.Scanner;

public class E_Ouize {
	Scanner sc = new Scanner(System.in);

	public void ifQuze1() {

		// 강사풀이!

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

		System.out.println("월을 입력해주세요.");
		int month = sc.nextInt();
		System.out.println("기온을 입력해주세요.");
		int temp = sc.nextInt();

		if (month == 1 || month == 2 || month == 12) {
			if (temp <= -15) {
				System.out.println("겨울이면서 한파 경보입니다.");
			} else if (temp <= -12) {
				System.out.println("겨울이면서 한파 주의보입니다.");
			} else {
				System.out.println("겨울입니다.");
			}
		} else if (month >= 3 && month <= 5) {
			System.out.println("봄 입니다.");
		} else if (month >= 6 && month <= 8) {
			if (temp >= 35) {
				System.out.println("여름이면서 폭염 경보 입니다.");
			} else if (temp >= 33) {
				System.out.println("여름이면서 폭염 주의보입니다.");
			} else {
				System.out.println("여름입니다.");
			}

		} else if (month >= 9 && month >= 11) {
			System.out.println("가을입니다.");
		} else {
			System.out.println("1~12월 사이의 값을 입력해주세요.");
		}

	}

	// 출력문이 너무 많아서 가독성이 떨어져서
	// String 이용해서 출력문 줄여보기
	public void ifQuize02() {
		System.out.println("월을 입력해주세요.");
		int month = sc.nextInt();
		System.out.println("기온을 입력해주세요.");
		int temp = sc.nextInt();
		String season = "";

		if (month == 1 || month == 2 || month == 12) {
			season = "겨울";
			if (temp <= -15) {
				season += "이면서 한파경보";
			} else if (temp <= -12) {
				season += "이면서 한파주의보";
			}
		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";
			if (temp >= 35) {
				season += "이면서 폭염경보";
			} else if (temp >= 33) {
				season += "이면서 폭염주의보";
			}

		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "입력하신 숫자가 1~12를 벗어나는 숫자";
		}
		System.out.println(season + "입니다.");
	}

	public void switchQuize3() {
		// 강사풀이!

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

		System.out.println("첫번째 값 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 값 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자(+,-,*,/%)");
		char op = sc.next().charAt(0);
		int result = 0;

		switch (op) {

		case '+':
			result = num1 + num2;
			break;
		case '-':
			if (num1 > num2) {
				result = num1 - num2;
			} else {
				result = num2 - num1;
			}
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			break;
		case '%':
			if (num2 != 0) {
				result = num1 % num2;
			} else {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			break;
		default:
			System.out.println("정확한 연산자를 입력해주세요.");

		}
		System.out.println(result);

	}

	public void switchQuize4() {

	}
}
