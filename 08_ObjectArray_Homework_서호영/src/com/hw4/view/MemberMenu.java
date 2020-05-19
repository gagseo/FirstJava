package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {

	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while (true) {
			System.out.println("====== ȸ�� ���� �޴� ======");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("6. ȸ�� ���� ����");
			System.out.println("9. ���α׷� ����");
			System.out.println("�޴� ���� : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}

	}

	public void insertMember() {

		// 1. ���� ȸ�� ��(memberCount)�� �ִ� ȸ�� ��(SIZE)�� �Ѿ ��� return ó��

		// 2. ���̵� �Է� �޾� MemberControllerdml checkId() �޼ҵ�� ���� >> ��� ��

		// 2_1. ��� ���� null�� �ƴ� ��� ��, ������ ���̵� �����ϴ� ���
		// �������� ���̵� �����մϴ�. ȸ����� ���С� ���
		// 2_2. ��� ���� null�� ��� ��, ������ ���̵� �������� �ʴ� ���
		// ������ ȸ�� ���� �Է� �޵��� (��й�ȣ, �̸�, ����,
		// ����, �̸���) // �Է� ���� ������ Member�� �Ű����� �����ڸ� �̿��Ͽ� ��ü ���� ��
		// MemberController insertMember() �޼ҵ�� ����
		// ������������ ȸ�� ����� �Ǿ����ϴ�.�� ��
		if (mc.getMemberCount() == mc.SIZE) {
			return;
		}

		System.out.println("���Ͻô� ���̵� �Է����ּ��� ");
		String userId = sc.nextLine();

		if (mc.checkId(userId) != null) {
			System.out.println("������ ���̵� �����մϴ�. ȸ����� ����");
			return;
		}

		System.out.println("��й�ȣ : ");
		String userPwd = sc.nextLine();
		System.out.println("�̸� : ");
		String userName = sc.nextLine();
		System.out.println("����: ");
		int userAge = sc.nextInt();
		sc.nextLine();
		System.out.println("���� : ");
		char gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("�̸��� : ");
		String userEmail = sc.nextLine();

		mc.insertMember(new Member(userId, userPwd, userName, userAge, gender, userEmail));
		System.out.println("���������� ȸ�� ����� �Ǿ����ϴ�.");
	}

	public void searchMember() {

		while (true) {
			System.out.println("====== ȸ�� ���� �˻� ======");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���� �޴���");
			System.out.println("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("�˻� ���� : ");
			String search = sc.nextLine();

			// 1. MemberController�� searchMember() �޼ҵ�� menu�� search ���ڿ� ���� >> ��� ��

			// 1_1. ��� ���� null�� ��� ��, �˻� ����� ���� ��� >> ���˻��� ����� �����ϴ�.�� ���
			if (mc.searchMember(menu, search) == null) {
				System.out.println("�˻��� ����� �����ϴ�.");
			}
			// 1_2. ��� ���� null�� �ƴ�
			// ��� ��, �˻� ����� �����ϴ� ��� >> ȸ�� ���� ���
			else {
				System.out.println(mc.searchMember(menu, search).toString());
			}

		}

	}

	public void updateMember() {

		while (true) {
			System.out.println("====== ȸ�� ���� ���� ======");
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("9. ���� �޴���");
			System.out.println("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println("�˻� ���� : ");
			String search = sc.nextLine();

		}

	}

	public void deleteMember() {

		System.out.println("������ ȸ�� ���̵� : ");
		String userId = sc.nextLine();

		// 1. MemberController�� checkId()�� userId ���� >> ��� �� (m : Member)
		if (mc.checkId(userId) == null) {
			// 1_1. ��� ����
			// null�� ��� �������� ȸ���� �������� �ʽ��ϴ�.�� ���
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		} else {
			// 1_2. ��� ���� null�� �ƴ� ��� ���� ���� ���
			System.out.println(mc.checkId(userId).toString());

			// ������ �����Ͻðڽ��ϱ�? (y/n) : �� >> Ű����� �Է� �ޱ�
			System.out.println("���� �����Ͻðڽ��ϱ�? (y/n) : ");
			char r = sc.next().charAt(0);
			sc.nextLine();
			if (r == 'y' || r == 'Y') {
				// ��ҹ��� ���� ���� ��Y���� ��� MemberController�� deleteMember()�� userId ����
				mc.deleteMember(userId);
				// ��ȸ���� ������ �����Ǿ����ϴ�.�� ���
				System.out.println("ȸ���� ������ �����Ǿ����ϴ�.");
			}

		}

	}

	public void printAllMember() {

		for (int i = 0; i < mc.getMem().length; i++) {
			if (mc.getMem()[i] != null) {
				System.out.println(mc.getMem()[i].toString());
			}

		}

	}

	public void sortMember() {

		Member[] sortMem = null;

		while (true) {

			System.out.println("====== ȸ�� ���� ���� ======");
			System.out.println("1. ���̵� �������� ����");
			System.out.println("2. ���̵� �����߻� ����");
			System.out.println("3. ���� �������� ����");
			System.out.println("4. ���� �������� ����");
			System.out.println("5. ���� �������� ����(������)");
			System.out.println("9. ���� �޴���");
			System.out.println("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				sortMem = mc.sortIdAsc();
				break;
			case 2:
				sortMem = mc.sortIdDesc();
				break;
			case 3:
				sortMem = mc.sortAgeAsc();
				break;
			case 4:
				sortMem = mc.sortAgeDesc();
				break;
			case 5:
				sortMem = mc.sortGenderDesc();
				break;
			case 9:
				System.out.println("���� �޴���");
				return;

			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}

			// �ݺ����� ���� sortMem ��ü �迭 ���
			for (int i = 0; i < mc.getMemberCount(); i++) {
				if (sortMem != null) {
					System.out.println(sortMem[i].toString());
				}
			}
		}

	}
}
