package logic.home.model;

import java.util.Scanner;

public class SwitchSample {

	Scanner sc = new Scanner(System.in);

	public void calculator() {

		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("산술연산자를 입력(+,-,*,/,%) : ");
		char cal = sc.next().charAt(0);
		int res = 0;

		switch (cal) {

		case '+':
			res = num1 + num2;
			break;
		case '-':
			if (num1 > num2) {
				res = num1 - num2;
			} else {
				res = num2 - num1;
			}
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				res = num1 / num2;
			} else {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			break;
		case '%':
			if (num2 != 0) {
				res = num1 % num2;
			} else {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			break;
		default:
			System.out.println("정확한 연산자를 입력해주세요.");

		}
		System.out.println(num1 + " " + cal + " " + num2 + " = " + res);
	}

	public void fruitPrice() {

		System.out.println("과일가게에 오신걸 환영합니다.");
		System.out.println("과일이름 : ");
		String fruit = sc.nextLine();
		int price = 0;

		switch (fruit) {
		case "사과":
			price = 1000;
			System.out.println("사과의 가격은 " + price + "원 입니다.");
			break;
		case "바나나":
			price = 4000;
			System.out.println("바나나의 가격은 " + price + "원 입니다.");
			break;
		case "수박":
			price = 10000;
			System.out.println("수박의 가격은 " + price + "원 입니다.");
			break;

		default:
			System.out.println("우리가게에 없는 과일입니다.");
			break;
		}

	}

}
