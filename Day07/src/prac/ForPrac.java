package prac;

import java.util.Scanner;

public class ForPrac {

	Scanner sc = new Scanner(System.in);

	// 정수를 하나 입력 받아 그 수가 1~9일 때만 그 수의 구구단을 출력하게 하고,
	// 양수가 아니면 "반드시 1~9 사이의 양수를 입력하여야 합니다." 출력
	public void fotQuize() {

		// 정수를입력받는다.
		System.out.println("몇단 입니까? : ");
		// 입력 받은 정수를 초기화한다.
		int dan = sc.nextInt();

		// 1~9일때 구구단을 출력한다.
		if (dan >= 1 && dan <= 9) {
			// 그 수의 구구단을 출력하게 하고,
			for (int i = 1; i < 10; i++) {

			}
		} else {
			// 아니면 "반드시 1~9사이의 양수를 입력하여야 합니다."출력
			System.out.println("반드시 1~9사이의 양수를 입력하여야 합니다.");

		}

	}

	// 두 수를 입력받아서 작은 수 부터 큰 수 사이 수들의 합을 구하라.
	// 단 같은 수가 입력될 경우 1~10까지의 수를 더하시오.
	public void fotQuize2() {

		// 두수를 입력받아서
		System.out.println("첫번째 수를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요. : ");
		int num2 = sc.nextInt();
		int res = 0;

		// 작은 수부터 큰 수 사이 수들의 합을 구하라

		// num1이 num2보다 작을때
		if (num1 > num2) {
			for (int i = num1; i < num2; i++) {
				res += i;
			}
		} else if (num2 < num1) {
			for (int i = num2; i < num1; i++) {
				res += i;
			}
		} else {
			for (int i = 1; i < 11; i++) {
				res += i;
			}
		}
		System.out.println(res);
	}

	public void fotQuize3() {
		// 위의 코드 줄여서 작성

		// 두수를 입력받아서
		System.out.println("첫번째 수를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요. : ");
		int num2 = sc.nextInt();
		int res = 0;
		int max = 0;
		int min = 0;
		// 작은 수부터 큰 수 사이 수들의 합을 구하라

		if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			if (num1 != num2) {
				max = num1;
				min = num2;
			} else {
				min = 1;
				max = 10;
			}
		}
		for (int i = min; i <= max; i++) {
			res += i;
		}
		System.out.println(res);
	}

	public void fotQuize4() {
		// 위의 코드를 더 줄여보자.(삼항연산자 사용)
		// 두수를 입력받아서
		System.out.println("첫번째 수를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수를 입력하세요. : ");
		int num2 = sc.nextInt();
		int res = 0;
		int max = 0;
		int min = 0;

		max = num1 > num2 ? num1 : num1 == num2 ? 10 : num2;
		min = num1 < num2 ? num1 : num1 == num2 ? 1 : num2;

		for (int i = min; i <= max; i++) {
			res += i;
		}
		System.out.println(res);

	}
}
