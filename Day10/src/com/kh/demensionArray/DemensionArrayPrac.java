package com.kh.demensionArray;

import java.util.Scanner;

public class DemensionArrayPrac<ArrayUtill> {
	Scanner sc = new Scanner(System.in);
	// 사용자에게 정수값을 하나 입력받아
	// 그 값의 크기와 같은 행과 열을 가지는 2차원 배열을 생성
	// 2차원 배열에 숫자를 1부터 순차적으로 입력하되
	// 행이 짝수 일때는 왼쪽에서 오른쪽으로
	// 행이 홀수 일때는 오른쪽에서 왼쪽으로 입력되도록 하시오.
	// ex) 사용자 입력값 3
	// 0 1 2 3
	// 1 6 5 4
	// 2 7 8 9

	public void test1() {

		System.out.println("사용자 입력값 : ");
		int num = sc.nextInt();
		// 1. 2차원 배열 초기화 하여 정수값 입력
		int[][] arr = new int[num][num];
		int a = 1;
		// 2. 2차워 배열 생성 단 열과행이 같아야함
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = a;
					a++;
					// 2-1 행이 짝수일때 오름차순

					// 2-1-1

					// 2-2 행이 홀수일때 내림차순
					// 2-2-1
				}
			} else {
				for (int j = num - 1; j >= 0; j--) {
					arr[i][j] = a;
					a++;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	// 사용자에게 정수값을 하나 입력받아
	// 그 값의 크기와 같은 행과 열을 가지는 2차원 배열을 생성
	// 2차원 배열에 숫자를 1부터 순차적으로 입력하되
	// 행이 짝수 일때는 왼쪽에서 오른쪽으로
	// 행이 홀수 일때는 오른쪽에서 왼쪽으로 입력되도록 하시오.
	// ex) 사용자 입력값 3
	// 0 1 2 3
	// 1 6 5 4
	// 2 7 8 9
	// 강사풀이

	public void test2() {
		System.out.print("작성 할 2차원배열의 행과 열을 입력하세요 :");
		int idx = sc.nextInt();
		int[][] iDArray = new int[idx][idx];
		int num = 1;
		for (int i = 0; i < iDArray.length; i++) {
			int num2 = iDArray.length * (i + 1);
			for (int j = 0; j < iDArray[i].length; j++) {

				if (i % 2 == 0) { // i가 짝수이면
					iDArray[i][j] = num;
				} else {
					iDArray[i][j] = num2;
				}
				num++;
				num2--;
			}
		}
		for (int i = 0; i < iDArray.length; i++) {
			for (int j = 0; j < iDArray[i].length; j++) {
				System.out.print("      " + iDArray[i][j]);
			}
			System.out.println();
		}
	}
}
