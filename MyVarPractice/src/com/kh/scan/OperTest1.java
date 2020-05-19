package com.kh.scan;

import java.util.Scanner;

public class OperTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a를 입력하세요 : ");
		int a = sc.nextInt();
		sc.nextLine();

		System.out.println("b를 입력하세요 : ");
		int b = sc.nextInt();
		sc.nextLine();

		System.out.println("c를 입력하세요 : ");
		int c = sc.nextInt();
		sc.nextLine();

		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		System.out.println("a의 값은 : " + a);
		System.out.println("b의 값은 : " + b);
		System.out.println("c의 값은 : " + c);
	}

}
