package logic.home.model;

import java.util.Scanner;

public class ForSample {

	Scanner sc = new Scanner(System.in);

	public void sum1To10() {

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

	public void sumEven1To100() {

		// int sum = 0;
		// for (int i = 2; i < 101; i += 2) {
		// sum += i;
		// }
		// System.out.println("1~100사이의 짝수들의 합은 " + sum + "입니다.");

		int evenSum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
		}
		System.out.println("1~100사이의 짝수들의 합은 " + evenSum + "입니다.");
	}

	public void oneGugudan() {

		System.out.println("정수하나 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}

	}

	public void sumMinToMax() {

		System.out.println("첫번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		int sum = 0;
		int max = 0;
		int min = 0;

		max = num1 > num2 ? num1 : num2;
		min = num1 < num2 ? num1 : num2;

		for (int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void printStar() {

		System.out.println("줄수 : ");
		int num1 = sc.nextInt();
		System.out.println("칸수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= num1; i++) {

			for (int j = 1; j <= num2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void printNumberStar() {

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j) {
					System.out.print(i);
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void printTriangleStar() {

		System.out.println("줄수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (num < 0) {
			for (int i = 1; i <= -num; i++) {
				for (int j = i; j <= -num; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public void guguDan() {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}

}
