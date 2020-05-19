package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	Scanner sc = new Scanner(System.in);

	public void array1() {

		// 배열
		// 자료형이 같은 변수방이 여러개 필요한 경우
		// int n1, int n2, int n3, int n4, int n5, int n6,
		// 이럴때 배열을 사용하면 편리함.
		// int[] ar = new int[6];

		// 1.배열 선언 : 배열공간의 시작주소 저장용 레퍼런스(참조형) 변수 만들기
		// 자료형[] 배열명(변수명);
		int[] ar; // 4byte를 잡고있다.

		// 2. 배열 할당 : new 연산자로 힙 메모리 영역에 배열공간을 할당허가
		// 발생한 주소를 준비한 배열 레퍼런스에 기록함.
		ar = new int[10];

		System.out.println("ar length : " + ar.length);
		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			System.out.println(i + " : " + ar[i]);
		}
	}

	public void array2() {

		// 배열의 크기는 정수변수로도 지정해줄 수 있다.
		// int idx = 10; < 1번
		// int idx = sc.nextInt(); < 2번
		int[] iArr = new int[sc.nextInt()]; // < 3번

		// 예) 사용자로 부터 배열의 크기를 입력받아 적용함.

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(i + " : " + iArr[i]);
		}
	}

	public void array3() {
		// 배열 선언과 동시에 할당 가능
		String[] sAr = new String[5];

		// 좋아하는 음식 5개 넣고
		// for문으로 배열안에 있는 전체 값들 출력하기.
		sAr[0] = "치킨";
		sAr[1] = "삼겹살";
		sAr[2] = "스테이크";
		sAr[3] = "피자";
		sAr[4] = "양념갈비";

		for (int i = 0; i < sAr.length; i++) {
			// for (int i = 0; i < sAr.length; i++) {} < for문 형식 외울것
			System.out.println(sAr[i]);
		}
	}

	public void array4() {

		// 배열 선언과 동시에 할당과 동시에 초기화
		int[] iArr = new int[] { 5, 4, 3, 2, 1 };
		// int[] iArr2 = { 1, 2, 3, 4, 5 }; // new int[] 생략가능
		iArr[3] = 100; // 값을 초기화 하면 그 값으로 출력되는것을 확인할 수 있다.
		System.out.println(iArr[3]);
	}

	public void array5() {

		int[] iArr = new int[] { 1, 2 };

		// 프로그래밍 유머
		// 전산과 학생 두명이 자리를 바꾸는데 필요한 의자의 갯수는 세개 입니다.

		int cnt = iArr[0];
		iArr[0] = iArr[1];
		iArr[1] = cnt;

		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}

	public void array6() {

		// 앞의 인덱스가 뒤의 인덱스보다 클 경우 자리 교환
		// 아닐경우 그대로있음

		int[] iArr = { 5, 3, 4, 1, 2 };

		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr.length - i - 1; j++) {

				if (iArr[j] > iArr[j + 1]) {
					int temp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = temp;
				}
			}
		}
		System.out.println(iArr);  //[I@1b6d3586 라고 출력
		System.out.println(Arrays.toString(iArr));
	}
}
