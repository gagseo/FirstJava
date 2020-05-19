package com.kh.controlstatement.loop;

import java.util.Scanner;

public class A2_ForDouble {

	Scanner sc = new Scanner(System.in);

	// 2중 for문 작성해보기
	public void testForDouble() {

		System.out.println("출력할 줄 수 : ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 2중 for문으로 구구단 출력해보기.
	public void testForDouble2() {

		for (int i = 2; i > 10; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}

	// 다운로드 받을 프로그램 갯수를 입력하세요:3
	// 1번째 프로그램 다운로드 받습니다.
	// 0% 진행중..
	// 20%진행중..
	// 40% 진행중..
	// 60% 진행중..
	// 80% 진행중..
	// 100% 진행중..
	// 1번째 프로그램 다운로드 완료 되었습니다.
	// ---------------------------
	// 2번째 프로그램 다운로드 받습니다.
	// 0% 진행중..
	// 20%진행중..
	// 40% 진행중..
	// 60% 진행중..
	// 80% 진행중..
	// 100% 진행중..
	// 2번째 프로그램 다운로드 완료 되었습니다.
	// ---------------------------
	// 3번째 프로그램 다운로드 받습니다.
	// 0% 진행중..
	// 20%진행중..
	// 40% 진행중..
	// 60% 진행중..
	// 80% 진행중..
	// 100% 진행중..
	// 3번째 프로그램 다운로드 완료 되었습니다.
	public void testForDouble3() {
		System.out.println("다운로드 받을 프로그램 갯수를  입력하세요 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("---------------------------");
			System.out.println(i + 1 + "번째 프로그램 다운로드 받습니다.");
			for (int j = 0; j < 6; j++) {
				System.out.println(j * 20 + "%진행중..");
			}
			System.out.println(i + 1 + "번째 프로그램 다운로드 완료 되었습니다.");
		}
		System.out.println("모든 프로그램 다운로드 완료되었습니다.");
	}

	// 줄 수 : 5
	// 칸 수 : 5
	// *****
	// *****
	// *****
	// *****
	// *****
	public void testForDouble4() {

		System.out.println("줄 수 : ");
		int num1 = sc.nextInt();
		System.out.println("칸 수 : ");
		int num2 = sc.nextInt();

		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	// 줄 수 : 7
	// 칸 수 : 7
	// 1******
	// *2*****
	// **3****
	// ***4***
	// ****5**
	// *****6*
	// ******7
	public void testForDouble5() {

		System.out.println("줄 수 : ");
		int row = sc.nextInt(); // 바깥 for문, 세로줄, row, 행
		System.out.println("칸 수 : ");
		int column = sc.nextInt(); // 안쪽 for문, 가로줄, column, 열

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
