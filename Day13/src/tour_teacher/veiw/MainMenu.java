package tour_teacher.veiw;

import java.util.Scanner;

import tour_teacher.controller.TourController;

public class MainMenu {

	Scanner sc = new Scanner(System.in);

	private TourController tc = new TourController();

	{
		System.out.println("******KH�װ��翡 ���� ���� ȯ���մϴ�******");
	}

	public MainMenu() {

	}

	public void mainMenu() {

		boolean b = true;
		while (b) {

			System.out.println("���� ���� �ݾ� : " + tc.bringMyMoney());

			System.out.println("���� ���� ���ϸ��� : " + tc.bringMyMile());

			System.out.println("��ȣ   ������   ����   ���ϸ���");
			System.out.println("1   �̱���   300000   3000");
			System.out.println("2   �߱���   200000   2000");
			System.out.println("3   �Ϻ���   150000   1500");
			System.out.println("������ ����(��ȣ�Է�) : ");
			int num = sc.nextInt();

			// ��ü�迭 ����� ����
			if (tc.isAble(num)) {
				// ��ü�迭 ����� ����
				tc.buyTicket(num);
				System.out.println("Ƽ���� �� �ܾ��� : " + tc.bringMyMoney());
				System.out.println("Ƽ���� �� ���ϸ����� : " + tc.bringMyMile());
			} else {
				System.out.println("�����ݾ��� �����մϴ�.");
				b = false;
			}

			//
			// ��ü�迭 ����� ����
			// switch (num) {
			// case 1:
			// if (tc.isAble(num)) {
			// // ��ü�迭 ����� ����
			// tc.buyTicket(num);
			// System.out.println("Ƽ���� �� �ܾ��� : " + tc.bringMyMoney());
			// System.out.println("Ƽ���� �� ���ϸ����� : " + tc.bringMyMile());
			//
			// } else {
			// System.out.println("�����ݾ��� �����մϴ�.");
			// b = false;
			// }
			// break;
			//
			// case 2:
			// if (tc.isAble(num)) {
			// tc.buyTicket(num);
			// System.out.println("Ƽ���� �� �ܾ��� : " + tc.bringMyMoney());
			// System.out.println("Ƽ���� �� ���ϸ����� : " + tc.bringMyMile());
			// } else {
			// System.out.println("�����ݾ��� �����մϴ�.");
			// b = false;
			// }
			// break;
			//
			// case 3:
			// if (tc.isAble(num)) {
			// tc.buyTicket(num);
			// System.out.println("Ƽ���� �� �ܾ��� : " + tc.bringMyMoney());
			// System.out.println("Ƽ���� �� ���ϸ����� : " + tc.bringMyMile());
			// } else {
			// System.out.println("�����ݾ��� �����մϴ�.");
			// b = false;
			// }
			// break;
			// }

		}

	}
}
