package logic.home.model;

import java.util.Scanner;

public class BreakSample {

	Scanner sc = new Scanner(System.in);

	public void sumBreak() {

		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			sum += i;
			if (i == 100) {
				break;
			}
		}
		System.out.println("1~100까지 정수들의 합계는 " + sum + "이다.");

	}

	public void gugudanBreak() {

		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				break;
			}
			for (int j = 1; j < 9; j++) {

				System.out.println(i + " * " + j + " = " + i * j);
			}

		}

	}

}
