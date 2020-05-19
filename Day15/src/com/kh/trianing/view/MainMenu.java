package com.kh.trianing.view;

import java.util.Scanner;

import com.kh.trianing.controller.TrainingManager;

public class MainMenu {

	Scanner sc = new Scanner(System.in);

	public MainMenu() {

	}

	public void mainMenu() {
		System.out.println("관리할 훈련생 수 : ");
		int cnt = sc.nextInt();

		TrainingManager tm = new TrainingManager(cnt);

		boolean res = true;

		while (true) {

			System.out.println("====== 메뉴 ======");

			System.out.println("1. 훈련생 추가");

			System.out.println("2. 훈련생 전체 조회");

			System.out.println("3. 훈련생 이름으로 검색");

			System.out.println("9. 프로그램 종료");

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
				System.out.println("잘못입력하셨습니다.");
			}

			if (num == 9) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
