package com.kh.operator;

import java.util.Scanner;

public class Logical {

	// 논리값 두개를 비교하는 연산자
	// And : &&(그리고, ~면서)
	// OR : ||(또는, ~거나)
	// 논리값 && 논리값, 논리값 || 논리값
	public void method1() {

		// 입력한 정수 값이 1~100사이의 숫자인지 확인하기.
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나 입력 : ");
		int num = sc.nextInt();

		// "num이 1부터 100사이인지 확인 : " + true/false
		System.out.println("num이 1부터 100사이인지 확인 : " + (num >= 1 && num <= 100));
	}

}
