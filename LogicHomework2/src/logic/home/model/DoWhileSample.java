package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {

	Scanner sc = new Scanner(System.in);

	public void addDashToken() {

		// �ٽ� Ȯ��
		System.out.println("���ڿ��� �Է� : ");
		String input = sc.nextLine();

		int i = 0;

		do {

			System.out.print(input.charAt(i));

			i++;
			if (i != input.length()) {
				System.out.print("-");
			}

		} while (!(i == input.length()));

		System.out.println();
	}

	public void burgerKingMenu() {

		do {

			System.out.println("*** ����ŷ�� ���Ű� ȯ���մϴ�  ***");
			System.out.println("�ܹ��Ÿ� ����ּ���.");
			System.out.println("1. �Ұ�����");
			System.out.println("2. ġ�����");
			System.out.println("3. ġŲ����");
			System.out.println("�޴��� ��� �ּ��� : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				System.out.println("�Ұ�� ���Ŵ� 2000�� �Դϴ�.");
				break;
			case 2:
				System.out.println("ġ�� ���Ŵ� 1000�� �Դϴ�.");
				break;
			case 3:
				System.out.println("ġŲ ���Ŵ� 2000�� �Դϴ�.");
				break;

			default:
				System.out.println("�߸������̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}

		} while (true);

	}

	public void isStringAlphabet() {

		System.out.println("������ �Է��ϼ���. : ");
		String input = sc.nextLine();

		// �ٽ�
		int i = 0;
		int check = 0;

		do {

			if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
				check += 0;
			} else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
				check += 0;
			} else {
				check++;
			}

			i++;

		} while (!(i == input.length()));

		if (check == 0) {
			System.out.println("������ �����ڴ�");
		} else {
			System.out.println("������ ������ �ƴϴ�.");
		}
	}

}
