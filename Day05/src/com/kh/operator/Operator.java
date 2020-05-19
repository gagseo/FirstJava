package com.kh.operator;

import java.util.Scanner;

public class Operator {

	Scanner sc = new Scanner(System.in); // 필드변수
	/*
	 * public void methodTest() { //메소드 String teststr = "어디까지 출력이 될까?"; }
	 */

	public void 논리연산자확인() {

		// 논리연산자는 &&, ||
		int num;
		int num2;

		System.out.println("첫번째 정수 하나 입력");
		num = sc.nextInt();
		System.out.println("두번째 정수 하나 입력");
		num2 = sc.nextInt();

		// && : 앞의 결과가 거짓이면, 뒤를 실행하지 않음
		// || : 앞의 결과가 참이면, 뒤를 실행하지 않음

		String res = num >= 1 && num++ <= 100 ? "num변수의 값은 1~100사이의 값이다" : "num변수의 값은 1~100사이의 값이 아니다";

		System.out.println("num의 값은 : " + num);

		String res2 = num2 >= 1 || num2++ <= 100 //
				? "num2의 값은 1보다 크거나 100보다 작다"
				: "num2의 값은 1보다 작고 100보다는 크다";

		System.out.println("num2의 값은 : " + num2);
	}
	// 실습문제
	// 3. 주민번호를 입력받고 삼항 연산자를 이용하여 미성년자인지 성인인지, 또 남자인지 여자인지 구분하여 출력하세요.
	// (2019년 기준 1999생부터 법적 성년)
	// 주민번호를 입력하세요(-포함) : 950101-2000000
	// 성인여자
	// 주민번호를 입력하세요(-포함) : 100101-1000000
	// 미성년남자

	public void method1() {

		System.out.println("주민번호를 입력해주세요.");
		String id = sc.nextLine();
		char isAdult = id.charAt(0);
		String resAdult = isAdult == '1' || isAdult == '0' ? "미성년자" : "성인"; //성인 미성년자 구분
		System.out.println(resAdult);

		char gender = id.charAt(7);
		String resGender = gender == '1' || gender == '3' ? "남자" : "여자"; // 남자 여자 구분
		System.out.println(resGender);
		}

}
