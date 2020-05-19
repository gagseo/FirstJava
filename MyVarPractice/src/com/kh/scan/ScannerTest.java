package com.kh.scan;

import java.util.Scanner;

public class ScannerTest {
	// 메인함수를 적어주시고
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : ");
		String name = scanner.nextLine();

		System.out.println("성별을 입력하세요 : ");
		String sex = scanner.nextLine();
		/*
		 * char sex = scanner.next().charAt(0); scanner.nextLine();
		 */
//		char를 쓰면 한글자만 표현할때 사용가능
		System.out.println("주소를 입력하세요 : ");
		String add = scanner.nextLine();

		System.out.println("이름 : " + name);
		System.out.println("성별 : " + sex);
		System.out.println("주소 : " + add);

	}
}
