package logic.home.model;

import java.util.Scanner;

public class WhileSample {

	Scanner sc = new Scanner(System.in);

	public void printUniCode() {

		while (true) {

			System.out.println("문자 하나 입력 : ");
			char c = sc.next().charAt(0);

			System.out.format("0x%04X%n", (int) c);

			if (c == '0')
				break;
		}

	}

	public void sum1To100() {

		int num = 1;
		int sum = 0;

		while (num < 101) {

			sum += num++;

		}
		System.out.println("1부터 100까지의 합은 " + sum + "입니다.");
	}

	public void numberGame() {

		int num = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		while (true) {

			count++;

			System.out.println("1과 100사이의 수를 입력하세요 : ");
			input = sc.nextInt();
			sc.nextLine();

			if (input == num) {
				System.out.println("정답입니다.");
				System.out.printf("%d번째 시도입니다.", count);
			} else if (input > num) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if (input < num) {
				System.out.println("더 큰수를 입력하세요.");

			}

		}

	}

	public void countCharacter() {

		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();

		System.out.println(str.length());

	}

	public void countInChar() {

		System.out.println("문자열을 입력하세요.");
		String str = sc.nextLine();
		System.out.println("문자 하나 입력하세요.");
		char c = sc.next().charAt(0);
		sc.nextLine();

		int cout = 0;
		int i = 0;
		// for문
		// for (int i = 0; i < str.length(); i++) {
		// if (str.charAt(i) == c) {
		// cout++;
		// }
		// }
		// System.out.println(cout);

		// while문
		while (i < str.length()) {

			if (str.charAt(i) == c) {
				cout++;
			}
			i++;
		}
		System.out.println(cout);

	}
}
