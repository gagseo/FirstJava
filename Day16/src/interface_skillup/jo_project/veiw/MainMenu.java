package interface_skillup.jo_project.veiw;

import java.util.Scanner;

import interface_skillup.jo_project.controller.Manager;
import interface_skillup.jo_project.model.vo.Adult;
import interface_skillup.jo_project.model.vo.Member;
import interface_skillup.jo_project.model.vo.Student;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	private Manager m = new Manager();

	public MainMenu() {

	}

	public void mainMenu() {

		System.out.println("이름을 입력하세요. : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요. :");
		int age = sc.nextInt();
		sc.nextLine();

		// 막힌부분
		if (age < 20) {
			m.insertMember(new Student(name, age, 15000, 0, 0, 0, 5));
		} else {
			m.insertMember(new Adult(name, age, 50000, 0, 0, 0, 3));
		}
		m.welcomeMessage();

		while (true) {
			System.out.println("---메뉴 ---");
			System.out.println("1. 마이페이지");
			System.out.println("2. 상품구매");
			System.out.println("3. 행운의 게임하기");
			System.out.println("4. 구매 내역 보기");
			System.out.println("9. 프로그램 종료하기");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {

			case 1:
				showMember();
				break;
			case 2:
				buyProduct();
				break;
			case 3:
				openLuckyBox();
				break;
			case 4:
				showBuyList();
				break;
			case 9:
				System.out.println("프로그램 종료하기");
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			if (num == 9) {
				System.out.println("프로그램 종료하기");
				break;
			}
		}
	}

	public void showMember() {
		m.showMember(0);
	}

	public void buyProduct() {
		m.showProduct();
		System.out.println("몇번상품을 구매하시겠습니까?: ");
		int index = sc.nextInt();
		sc.nextLine();

		switch (m.buyProduct(index - 1)) {
		case 'n':
			System.out.println("성인만 구매가 가능한 상품입니다.");
			break;
		case 'y':
			System.out.println("상품이 정상적으로 구매되었습니다. \n 쿠폰이 1장 적립되었습니다.");
			break;
		case 's':
			System.out.println("죄송합니다. 해당상품의 재고가 없습니다.");
			break;
		case 'm':
			System.out.println("잔액이 부족합니다.");
			break;
		}
	}

	public void openLuckyBox() {
		m.openLuckyBox();
	}

	public void showBuyList() {
		m.showBuyList();
	}

	// 1명의 성인 회원, 1명의 학생회원을 생성하여 Member로 초기화 함
	// 학생 회원에게는, 가입 시 학생 할인 쿠폰을 5장 제공하고,
	// 성인 회원에게는, 가입 시 할인 쿠폰을 3장 제공합니다.
	// 누적 1천원 이상 구매 시 신규 쿠폰이 1개 발행됩니다.
	// 구매 횟수 5회마다 쿠폰이 1개 발행됩니다.
	// 쿠폰이 누적 10개 이상이 되거나 누적 금액 1만원이 되면 ("VIP회원이 되셨습니다.") 출력

}
