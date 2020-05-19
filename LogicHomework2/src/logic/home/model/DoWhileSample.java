package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {

	Scanner sc = new Scanner(System.in);

	public void addDashToken() {

		// 다시 확인
		System.out.println("문자열을 입력 : ");
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

			System.out.println("*** 버기킹에 오신걸 환영합니다  ***");
			System.out.println("햄버거를 골라주세요.");
			System.out.println("1. 불고기버거");
			System.out.println("2. 치즈버거");
			System.out.println("3. 치킨버거");
			System.out.println("메뉴를 골라 주세요 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				System.out.println("불고기 버거는 2000원 입니다.");
				break;
			case 2:
				System.out.println("치즈 버거는 1000원 입니다.");
				break;
			case 3:
				System.out.println("치킨 버거는 2000원 입니다.");
				break;

			default:
				System.out.println("잘못누르셨습니다. 다시 입력해주세요.");
				break;
			}

		} while (true);

	}

	public void isStringAlphabet() {

		System.out.println("문장을 입력하세요. : ");
		String input = sc.nextLine();

		// 다시
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
			System.out.println("모든글자 영문자다");
		} else {
			System.out.println("모든글자 영문자 아니다.");
		}
	}

}
