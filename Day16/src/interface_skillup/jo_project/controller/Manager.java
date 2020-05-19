package interface_skillup.jo_project.controller;

import java.util.Scanner;

import interface_skillup.jo_project.model.vo.Adult;
import interface_skillup.jo_project.model.vo.ForAdult;
import interface_skillup.jo_project.model.vo.Member;
import interface_skillup.jo_project.model.vo.Product;
import interface_skillup.jo_project.model.vo.Student;

public class Manager {
	Scanner sc = new Scanner(System.in);
	private Member mem = null;
	private Product[] product = new Product[5];
	private Product[] buyList = new Product[100];
	private int buyListCount = 0;

	{
		product[0] = new Product("연필", 200, 3);
		product[1] = new Product("티슈", 300, 3);
		product[2] = new ForAdult("담배", 4500, 20, 3);
		product[3] = new Product("커피", 1000, 10);
		product[4] = new ForAdult("참이슬", 2700, 20, 3);
	}

	public Manager() {

	}

	public void insertMember(Member mem) {
		this.mem = mem;
	}

	public void welcomeMessage() {

		if (mem instanceof Student) {
			((Student) mem).basicCoupon();
		} else if (mem instanceof Adult) {
			((Adult) mem).basicCoupon();
		}

	}

	public void showMember(int index) {

		System.out.println(mem.toString());
	}

	public void showProduct() {

		for (int i = 0; i < product.length; i++) {
			System.out.println("상품번호 : " + (i + 1) + product[i].toString());
		}

	}

	public char buyProduct(int index) {
		// 막힌 부분
		char result = 'n';
		if (product[index] instanceof ForAdult && mem.getAge() < ((ForAdult) product[index]).getAccessAge()) {
			if (product[index].getStock() < 1) {
				result = 's';
			} else if (mem.getMyMoney() < 0) {
				result = 'm';
			}

			result = 'n';
		} else {

			// 상품 구매 성공시 모든 상품 1개당 쿠폰 1장 지급
			// 내돈에서 물건 살때
			mem.setMyMoney(mem.getMyMoney() - product[index].getpPrice());
			// 내마일리지에서 물건 살떄
			mem.setMileage(mem.getMileage() + product[index].getpPrice());
			// 내 쿠폰에서 물건살때
			mem.setCouponCount(mem.getCouponCount() + 1);

			mem.setBuyCount(mem.getBuyCount() + 1);
			product[index].setStock(product[index].getStock() - 1);

			buyList[buyListCount] = new Product(product[index].getpName(), product[index].getpPrice(),
					product[index].getpPrice());
			buyListCount++;
			result = 'y';

			if (product[index].getStock() < 1) {
				result = 's';
			} else if (mem.getMyMoney() < 0) {
				result = 'm';
			}
		}
		checkMemberShip();
		return result;
	}

	public void openLuckyBox() {
		if (mem.getOpenChance() > 0) {
			System.out.println("오늘의 남은 기회 : " + mem.getOpenChance());

			int num = 0;
			if (mem instanceof Student) {
				System.out.println("1부터 3까지의 숫자를 고르세요, 맞추면 쿠폰 1장이 지급됩니다.");
				sc.nextInt();
				sc.nextLine();
				//
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Student) mem).openLuckyBox(num);
			} else if (mem instanceof Adult) {
				System.out.println("1부터 5까지의 숫자를 고르세요, 맞추면 쿠폰이 1장이 지급됩니다.");
				sc.nextInt();
				sc.nextLine();
				//
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Adult) mem).openLuckyBox(num);
			} else {
				System.out.println("모든 기회가 소진 되었습니다.");
			}
			checkMemberShip();
		}
	}

	public void showBuyList() {

		// 총 누적 구매 물품개수, 총 누적 구매 금액 출력
		// 구매 내역 확인 후 출력

		int totalBuyM = 0;
		for (int i = 0; i < buyList.length; i++) {
			if (buyList[i] != null) {
				System.out.println((i + 1) + "번째" + buyList[i].getpName());
				totalBuyM += buyList[i].getpPrice();
			} else {
				break;
			}

		}
	}

	public void checkMemberShip() {

		if (mem.getCouponCount() > 9) {
			System.out.println("축하합니다. 쿠폰 갯수가" + mem.getCouponCount() + "개가 되어 VIP회원이 되셨습니다.");
		}
	}
}
