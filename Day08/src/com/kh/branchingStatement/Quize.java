package com.kh.branchingStatement;

import java.util.Scanner;

public class Quize {

	Scanner sc = new Scanner(System.in);

	public void quize1() {

		// 프로그램이 시작되면
		// “커피재고를 입력하세요. 종료하려면 0을 입력 하세요 :” 안내창을 출력하고
		// 입고 할 커피재고를 사용자로부터 입력 받으세요.
		// 만약 커피재고를 0으로 입력할 경우 프로그램을 종료하세요.
		//
		// 재고 입고가 잘 이루어 지면
		// "고객이 몇 잔의 커피를 주문하였습니까?" 라는 안내문을 출력한 뒤
		// 고객이 주문한 커피 잔 수를 사용자로부터 입력 받아,
		// 가게 재고에서 고객이 주문한 커피 수량을 차감 시키세요.
		//
		// 재고가 0이 되면 "커피 재고가 부족합니다"
		// 안내문을 출력한 뒤 프로그램을 종료하세요.
		//
		// 고객이 주문한 커피 수량이 남은 재고보다 많을 경우
		// "주문량 보다 재고가 적습니다."
		// "주문을 다시 받아 주세요."
		// 안내문을 출력한 뒤 프로그램을 종료하세요.
		//
		// 주문이 정상적으로 이루어 지면
		// "남은 커피 재고는 N 잔 입니다."
		// 형식으로 재고를 출력 해준 뒤
		// "고객이 몇 잔의 커피를 주문하였습니까?"
		// 안내창으로 돌아가세요.

		int jego = 0;
		int order = 0;
		boolean mt = true;

		do {
			if (mt) {
				System.out.println("커피재고를 입력하세요. 종료하려면 0을 입력하세요 : ");
				jego = sc.nextInt();
				mt = false;
				if (jego == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
			System.out.println("고객이 몇잔의 커피를 주문하였습니까?");
			order = sc.nextInt();

			if (jego >= order) {
				jego -= order;
				System.out.println("남은 커피 재고는" + jego + "입니다.");
				System.out.println("----------------------------");
				if (jego == order) {
					System.out.println("재고가 0입니다.");
				}

			} else if (order > jego) {
				System.out.println("주문량 보다 재고가 적습니다.");
				System.out.println("주문을 다시 받아주세요.");
				mt = true;
			}
		} while (true);

	}

	// 강사풀이 1단계
	public void quize2() {
		boolean rgx = false;
		int stock = 0;

		System.out.println("커피재고를 입력하세요. 종료하려면 0을 입력하세요.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("재고를 0개이상 입력해주세요.");
		} else {
			rgx = true;
		}
		while (rgx) {
			System.out.println();
			System.out.println("고객이 몇 잔의 커피를 주문하였습니까?");
			int sellcoffee = sc.nextInt();

			// 고객이 주문한 커피수량보다 재고가 많은 경우
			if (stock >= sellcoffee) {
				// 고객이 주문한 커피수량과 재고가 같은 경우
				if (stock == sellcoffee) {
					System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
					System.out.println("커피 재고가 없습니다.");
					stock -= sellcoffee;
					rgx = false;
				} else {
					System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
					stock -= sellcoffee;
					System.out.println("남은 커피 재고는 " + stock + "입니다.");
					System.out.println("-------------------------------");
				}
			} else {
				// 고객이 주문한 커피수량이 재고보다 많은 경우
				System.out.println("주문량보다 재고가 적습니다.");
				System.out.println("주문을 다시 받아 주세요.");
				rgx = false;
			}

		}

		System.out.println("프로그램이 종료 되었습니다.");
	}

	// 강사풀이 2단계
	public void quize3() {
		boolean rgx = false;
		int stock = 0;

		System.out.println("커피재고를 입력하세요. 종료하려면 0을 입력하세요.");
		stock = sc.nextInt();

		if (stock == 0) {
			System.out.println("재고를 0개이상 입력해주세요.");
		} else {
			rgx = true;
		}
		while (rgx) {
			System.out.println();
			System.out.println("고객이 몇 잔의 커피를 주문하였습니까?");
			int sellcoffee = sc.nextInt();

			// 고객이 주문한 커피수량보다 재고가 많은 경우
			if (stock >= sellcoffee) {
				// 고객이 주문한 커피수량과 재고가 같은 경우
				if (stock == sellcoffee) {
					System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
					System.out.println("커피 재고가 없습니다.");
					stock -= sellcoffee;
					rgx = false;
				} else {
					System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
					stock -= sellcoffee;
					System.out.println("남은 커피 재고는 " + stock + "입니다.");
					System.out.println("-------------------------------");
				}
			} else {
				// 고객이 주문한 커피수량이 재고보다 많은 경우
				System.out.println("주문량보다 재고가 적습니다.");
				System.out.println("주문을 다시 받아 주세요.");
				// rgx = false;
			}

		}

		System.out.println("프로그램이 종료 되었습니다.");

	}

	// 강사풀이 3단계
	public void quize4() {

		boolean rgx = false;
		boolean stockRgx = true;
		int stock = 0;

		do {

			if (stockRgx) {

				System.out.println("커피재고를 입력하세요. 종료하려면 0을 입력하세요");
				System.out.print("커피재고 : ");
				stock = sc.nextInt();

				if (stock > 0) {
					rgx = true;
					stockRgx = false;
					System.out.println("커피판매를 시작합니다.");
					System.out.println("------------------------------");
				} else {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}

			if (rgx) {
				System.out.println();
				System.out.print("고객이 몇 잔의 커피를 주문하였습니까 ? :");
				int sellcoffee = sc.nextInt();

				if (stock >= sellcoffee) {

					if (stock - sellcoffee > 0) {

						stock -= sellcoffee;
						System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
						System.out.println("남은 커피 재고는 " + stock + "입니다.");
						System.out.println("------------------------------");

					} else {
						stock -= sellcoffee;
						System.out.println("커피" + sellcoffee + "잔 판매하였습니다.");
						System.out.println("커피재고가 없습니다.\n");
						// rgx = false;
						stockRgx = true;
					}

				} else {

					System.out.println("주문량 보다 재고가 적습니다.");
					System.out.println("주문을 다시 받아 주세요.");
					System.out.println("------------------------------");
					continue;
				}
			}

			// 프로그램 실행 순서와 다르게
			// 아래에서 재고를 입력 받는 것이 좋은 코드인지 생각해보기.

			/*
			 * if(!rgx) {
			 * 
			 * System.out.println("커피재고를 입력하세요. 종료하려면 0을 입력하세요");
			 * System.out.print("커피재고 : "); stock = sc.nextInt();
			 * 
			 * if(stock > 0) { rgx = true; System.out.println("커피판매를 시작합니다.");
			 * System.out.println("------------------------------"); }else {
			 * System.out.println("프로그램을 종료합니다."); } }
			 */

		} while (rgx);

	}
}
