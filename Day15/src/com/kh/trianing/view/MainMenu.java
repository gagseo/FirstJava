package com.kh.trianing.view;

import java.util.Scanner;

import com.kh.trianing.controller.TrainingManager;

public class MainMenu {

	Scanner sc = new Scanner(System.in);

	public MainMenu() {

	}

	public void mainMenu() {
		System.out.println("������ �Ʒû� �� : ");
		int cnt = sc.nextInt();

		TrainingManager tm = new TrainingManager(cnt);

		boolean res = true;

		while (true) {

			System.out.println("====== �޴� ======");

			System.out.println("1. �Ʒû� �߰�");

			System.out.println("2. �Ʒû� ��ü ��ȸ");

			System.out.println("3. �Ʒû� �̸����� �˻�");

			System.out.println("9. ���α׷� ����");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				tm.insertTrainees();
				break;
			case 2:
				tm.printTrainees();
				break;
			case 3:
				tm.searchTrainee();
				break;
			case 9:
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}

			if (num == 9) {
				System.out.println("���α׷� ����");
				break;
			}

		}

	}

}
