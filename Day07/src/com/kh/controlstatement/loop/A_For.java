package com.kh.controlstatement.loop;

import java.util.Scanner;

//for문은 지정한 값으로 돌릴때 사용
public class A_For {

	Scanner sc = new Scanner(System.in);

	// 알파벳 A의 아스키코드는 65입니다.
	// 알파벳 B의 아스키코드는 66입니다.
	// 알파벳 C의 아스키코드는 67입니다.
	// 알파벳 D의 아스키코드는 68입니다.
	// 알파벳 E의 아스키코드는 69입니다.
	// 알파벳 F의 아스키코드는 70입니다.
	// 알파벳 G의 아스키코드는 71입니다.
	// 알파벳 H의 아스키코드는 72입니다.
	// 알파벳 I의 아스키코드는 73입니다.
	// ................
	// 알파벳 Z의 아스키코드는 90입니다.
	// 를 출력하라
	public void forSatetment() {

		char alphabet = 'A';
		for (int i = 0; i < 26; i++) {
			// for(초기식; 조건식; 증감식){}
			System.out.println("알파벳" + (char) (alphabet + i) + "의 아스키코드는" + (int) (alphabet + i) + "입니다.");
		}

	}

	// 1~100까지의 숫자중, 2의 배수만 출력해보자.
	public void testFor2() {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	public void testFor3() {

		// 0,1,2,3,4 를 for문으로 작성하라.

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		// -5,-4,-3,-2,-1,0
		for (int i = -5; i <= 0; i++) {
			System.out.println(i);
		}

		// 2, 4, 6, 8
		for (int i = 2; i < 9; i = i + 2) {
			// for문에서는 증감식(i=i+2)에 ++만 쓰는걸 권장한다.
			System.out.println(i);
		}

	}

	// for문으로 구구단 출력해보기
	// 사용자로부터 값을 입력받아서 그 값의 구구단을 출력하시오.

	public void testFor4() {
		System.out.println("몇단?");
		int gugu = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(gugu + " * " + i + " = " + (gugu * i));
		}

	}
}
