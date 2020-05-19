package com.kh.print;

import java.util.Scanner;

public class PrintPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력해주세요 : ");
		String name = sc.nextLine();

		System.out.print("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine(); // 숫자를 입력하는 메소드를 쓰면 sc.nextLine();을 처리해줘야한다. 엔터로 인식하지 않는다.

		System.out.print("주소를 입력해주세요 : ");
		String add = sc.nextLine();

		System.out.print("키를 입력해주세요 : ");
		double tall = sc.nextDouble();

		System.out.print("몸무게를 입력해주세요 : ");
		double weight = sc.nextDouble();

		System.out.print("성별 입력해주세요 : ");
		char gender = sc.next().charAt(0);
		// 형식에 맞게 출력

		System.out.println("당신의 이름은 : " + name);
		System.out.println("당신의 나이는 : " + age);
		System.out.println("당신의 주소는 : " + add);
		System.out.println("당신의 키는 : " + (int) tall);
		System.out.printf("당신의 몸무게는 : %.1f\n", weight);
		System.out.println("당신의 성별은 : " + gender);

	}
}
