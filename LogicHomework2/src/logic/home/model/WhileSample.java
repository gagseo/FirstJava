package logic.home.model;

import java.util.Scanner;

public class WhileSample {

	Scanner sc = new Scanner(System.in);

	public void printUniCode() {

		while (true) {

			System.out.println("���� �ϳ� �Է� : ");
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
		System.out.println("1���� 100������ ���� " + sum + "�Դϴ�.");
	}

	public void numberGame() {

		int num = (int) (Math.random() * 100) + 1;
		int input = 0;
		int count = 0;

		while (true) {

			count++;

			System.out.println("1�� 100������ ���� �Է��ϼ��� : ");
			input = sc.nextInt();
			sc.nextLine();

			if (input == num) {
				System.out.println("�����Դϴ�.");
				System.out.printf("%d��° �õ��Դϴ�.", count);
			} else if (input > num) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else if (input < num) {
				System.out.println("�� ū���� �Է��ϼ���.");

			}

		}

	}

	public void countCharacter() {

		System.out.println("���ڿ��� �Է��ϼ���.");
		String str = sc.nextLine();

		System.out.println(str.length());

	}

	public void countInChar() {

		System.out.println("���ڿ��� �Է��ϼ���.");
		String str = sc.nextLine();
		System.out.println("���� �ϳ� �Է��ϼ���.");
		char c = sc.next().charAt(0);
		sc.nextLine();

		int cout = 0;
		int i = 0;
		// for��
		// for (int i = 0; i < str.length(); i++) {
		// if (str.charAt(i) == c) {
		// cout++;
		// }
		// }
		// System.out.println(cout);

		// while��
		while (i < str.length()) {

			if (str.charAt(i) == c) {
				cout++;
			}
			i++;
		}
		System.out.println(cout);

	}
}
