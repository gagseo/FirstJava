package com.kh.operator;

import java.util.Scanner;

public class Triple {

	// 3항연산자
	// 조건식 ? 식1 : 식2
	public void method() {

		// 입력 받은 정수가 홀수인지 짝수 인지 판별후 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();

		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "은/는" + result + "이다");

	}

	public void method2() {

		// 입력 받은 정수가 양수인지 아닌지 판별 후 출력
		// 출력 : "num은 양수/음수 입니다"
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num2 = sc.nextInt();

		String result2 = (num2 >= 0) ? "양수" : "음수";
		System.out.println(num2 + "은/는" + result2 + "이다");
	}

	public void method3() {
		// 삼항연산자 중첩 사용
		// 입력받은 정수가 양수, 0, 음수 인지 판별 후 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나 입력 : ");
		int num3 = sc.nextInt();

		String result3 = (num3 == 0) ? "0" : (num3 > 0) ? "양수" : "음수";
		System.out.println(num3 + "은/는" + result3 + "이다");

	}

	public void method4() {

		// 두 수와 '+', 또는 '-'를 입력받아 알맞은 계산 결과 출력하기.
		// 단 '+', '-'이외의 연산자 입력 시 "잘못 입력하셨습니다." 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수 : ");
		int numA = sc.nextInt();
		System.out.println("두 번째 수 :");
		int numB = sc.nextInt();

		// 스캐너 버퍼에 담겨있는 데이터를 비워준다.
		sc.nextLine();

		System.out.println("연산자 입력( + or - or * or /) :");
		// 사용자로 부터 입력받은 문자열의 첫번째 문자를 반환한다.
		// 사용자가 입력한 연산자가 op에 담겨있다.

		char op = sc.nextLine().charAt(0);

		// String result = 삼항연산자.
		// a+b+""
		// a-b+""
		
		// String result4 = (op == '+') ? "numA + numB : " + (numA + numB)
		// : (op == '-') ? "numA - numB : " + (numA - numB)
		// : (op == '*') ? "numA * numB = " + (numA * numB)
		// : (op == '/') ? "numA / numB = " + (numA / numB) : "잘못입력되셨습니다.";
		// System.out.println(result4);
		
		String result4 = (op == '+') ? (numA + numB + "")
				: (op == '-') ? (numA - numB + "")
						: (op == '*') ? (numA * numB + "") : (op == '/') ? (numA / numB + "") : "잘못입력하셨습니다.";
		System.out.println(result4);
	}

}
