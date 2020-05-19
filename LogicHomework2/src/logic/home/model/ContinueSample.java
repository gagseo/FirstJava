package logic.home.model;

import java.util.Scanner;

public class ContinueSample {

	Scanner sc = new Scanner(System.in);

	public void sumJumpThree() {

		int sum = 0;

		for (int i = 1; i < 101; i++) {

			if (i % 3 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100까지 합계 중 3의 배수를 뺀 합계는 " + sum + "입니다.");
	}

	public void rowColJump() {

		// 3행 5열
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				if (i == 1) {
					if (j >= 3 && j <= 5) {
						continue;
					}
				}
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
