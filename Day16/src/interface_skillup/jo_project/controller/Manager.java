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
		product[0] = new Product("����", 200, 3);
		product[1] = new Product("Ƽ��", 300, 3);
		product[2] = new ForAdult("���", 4500, 20, 3);
		product[3] = new Product("Ŀ��", 1000, 10);
		product[4] = new ForAdult("���̽�", 2700, 20, 3);
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
			System.out.println("��ǰ��ȣ : " + (i + 1) + product[i].toString());
		}

	}

	public char buyProduct(int index) {
		// ���� �κ�
		char result = 'n';
		if (product[index] instanceof ForAdult && mem.getAge() < ((ForAdult) product[index]).getAccessAge()) {
			if (product[index].getStock() < 1) {
				result = 's';
			} else if (mem.getMyMoney() < 0) {
				result = 'm';
			}

			result = 'n';
		} else {

			// ��ǰ ���� ������ ��� ��ǰ 1���� ���� 1�� ����
			// �������� ���� �춧
			mem.setMyMoney(mem.getMyMoney() - product[index].getpPrice());
			// �����ϸ������� ���� �싚
			mem.setMileage(mem.getMileage() + product[index].getpPrice());
			// �� �������� ���ǻ춧
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
			System.out.println("������ ���� ��ȸ : " + mem.getOpenChance());

			int num = 0;
			if (mem instanceof Student) {
				System.out.println("1���� 3������ ���ڸ� ������, ���߸� ���� 1���� ���޵˴ϴ�.");
				sc.nextInt();
				sc.nextLine();
				//
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Student) mem).openLuckyBox(num);
			} else if (mem instanceof Adult) {
				System.out.println("1���� 5������ ���ڸ� ������, ���߸� ������ 1���� ���޵˴ϴ�.");
				sc.nextInt();
				sc.nextLine();
				//
				mem.setOpenChance(mem.getOpenChance() - 1);
				((Adult) mem).openLuckyBox(num);
			} else {
				System.out.println("��� ��ȸ�� ���� �Ǿ����ϴ�.");
			}
			checkMemberShip();
		}
	}

	public void showBuyList() {

		// �� ���� ���� ��ǰ����, �� ���� ���� �ݾ� ���
		// ���� ���� Ȯ�� �� ���

		int totalBuyM = 0;
		for (int i = 0; i < buyList.length; i++) {
			if (buyList[i] != null) {
				System.out.println((i + 1) + "��°" + buyList[i].getpName());
				totalBuyM += buyList[i].getpPrice();
			} else {
				break;
			}

		}
	}

	public void checkMemberShip() {

		if (mem.getCouponCount() > 9) {
			System.out.println("�����մϴ�. ���� ������" + mem.getCouponCount() + "���� �Ǿ� VIPȸ���� �Ǽ̽��ϴ�.");
		}
	}
}
