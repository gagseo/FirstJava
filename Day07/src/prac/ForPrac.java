package prac;

import java.util.Scanner;

public class ForPrac {

	Scanner sc = new Scanner(System.in);

	// ������ �ϳ� �Է� �޾� �� ���� 1~9�� ���� �� ���� �������� ����ϰ� �ϰ�,
	// ����� �ƴϸ� "�ݵ�� 1~9 ������ ����� �Է��Ͽ��� �մϴ�." ���
	public void fotQuize() {

		// �������Է¹޴´�.
		System.out.println("��� �Դϱ�? : ");
		// �Է� ���� ������ �ʱ�ȭ�Ѵ�.
		int dan = sc.nextInt();

		// 1~9�϶� �������� ����Ѵ�.
		if (dan >= 1 && dan <= 9) {
			// �� ���� �������� ����ϰ� �ϰ�,
			for (int i = 1; i < 10; i++) {

			}
		} else {
			// �ƴϸ� "�ݵ�� 1~9������ ����� �Է��Ͽ��� �մϴ�."���
			System.out.println("�ݵ�� 1~9������ ����� �Է��Ͽ��� �մϴ�.");

		}

	}

	// �� ���� �Է¹޾Ƽ� ���� �� ���� ū �� ���� ������ ���� ���϶�.
	// �� ���� ���� �Էµ� ��� 1~10������ ���� ���Ͻÿ�.
	public void fotQuize2() {

		// �μ��� �Է¹޾Ƽ�
		System.out.println("ù��° ���� �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���. : ");
		int num2 = sc.nextInt();
		int res = 0;

		// ���� ������ ū �� ���� ������ ���� ���϶�

		// num1�� num2���� ������
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
		// ���� �ڵ� �ٿ��� �ۼ�

		// �μ��� �Է¹޾Ƽ�
		System.out.println("ù��° ���� �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���. : ");
		int num2 = sc.nextInt();
		int res = 0;
		int max = 0;
		int min = 0;
		// ���� ������ ū �� ���� ������ ���� ���϶�

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
		// ���� �ڵ带 �� �ٿ�����.(���׿����� ���)
		// �μ��� �Է¹޾Ƽ�
		System.out.println("ù��° ���� �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���. : ");
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
