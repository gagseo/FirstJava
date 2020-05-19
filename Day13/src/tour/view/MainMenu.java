package tour.view;

import java.util.Scanner;

import tour.controller.TourController;
import tour.model.vo.Tourist;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	private TourController tc = new TourController();

	{
		System.out.println("******KH�װ��翡 ���� ���� ȯ���մϴ�******");
	}

	public MainMenu() {

	}

	public void mainMenu() { // ������ �κ�

		boolean cont = true;

		System.out.println("���� ���� �ݾ� : " + tc.bringMyMoney());

		System.out.println("���� ���� ���ϸ��� : " + tc.bringMyMil());
		// �޴� ���� �ۼ� ����
		System.out.println("��ȣ    ������    ����    ���ϸ���");
		System.out.println();

		do {

			// �Ʒ��κ� ����
			System.out.println("������ ����(��ȣ�Է�) : ");
			int go = sc.nextInt();

			switch (go) {
			case 1:
				if (tc.isAble(tc.bringMyMoney())) {
					tc.buyTiket1();
				} else {
					System.out.println("���� ���� �ݾ��� �����մϴ�.");
				}
				break;
			case 2:
				if (tc.isAble(tc.bringMyMoney())) {
					tc.buyTiket2();
				} else {
					System.out.println("���� ���� �ݾ��� �����մϴ�.");
				}
				break;
			case 3:
				if (tc.isAble(tc.bringMyMoney())) {
					tc.buyTiket3();
				} else {
					System.out.println("���� ���� �ݾ��� �����մϴ�.");
				}
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			System.out.println("Ƽ���� �� �ܾ��� : " + tc.bringMyMoney());
			System.out.println("Ƽ���� �� ���ϸ����� : " + tc.bringMyMil());

		} while (cont);

	}

}
