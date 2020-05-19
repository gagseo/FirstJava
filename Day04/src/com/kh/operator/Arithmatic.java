package com.kh.operator;

import java.util.Scanner;

public class Arithmatic {

	// 산술연산자
	// +(더하기), -(빼기), *(곱하기), /(나누기), %(나머지)

	public void method1() {

		int num1 = 10;
		int num2 = 3;

		double dNum1 = 10.0;
		double dNum2 = 3.0;
		
		int res = num1 + num2;

		// + - * 출력
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));

		// / % 출력
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		// 실수형의 '/', '%' 연산
		System.out.println("dNum1 / dNum2 = " + (dNum1 / dNum2));
		System.out.println("dNum1 % dNum2 = " + (dNum1 % dNum2));

		// '%' 연산자를 주로 사용하는 경우
		// 배수확인
		// num1 % num2 == 0
		// 짝수 홀수 확인
		// num1 % 2 == 0 (짝수)
		// num1 % 2 == 1 (홀수)

	}
}
