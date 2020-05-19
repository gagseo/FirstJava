package view;

import java.util.Scanner;

import controller.MovieManager;
import model.vo.User;

public class MainMeun {

	Scanner sc = new Scanner(System.in);
	MovieManager mm = new MovieManager();
	int reservationIndex = 0;

	public MainMeun() {

		{
			System.out.println("======KH��ȭ���� ���� ���� ȯ���մϴ�======");
			System.out.println();
			System.out.println("�ڿ�ȭ���� 30% ���� ����");
			System.out.println("1. ��ȭ�����ϰ� ������� ������ ���� ���");
			System.out.println("2. ��ȭ�� 11�� ���� ���� ��ȭ�� ���");
			System.out.println("3. ���������� �����ϰ� ��� ���");
			System.out.println("��� ������ �ߺ� �Ұ��ϸ� ���ο� �ش��ϴ� ��� \n �Բ� �����ϴ� ��ΰ� ���ε� ������ ����޽��ϴ�.");
			System.out.println("================================");

		}

	}

	public void mainMeun() {

		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("����(4�ڸ� ex)1114)�� �Է��ϼ��� : ");
		int birth = sc.nextInt();
		sc.nextLine();
		System.out.println("������ ��� ������ ������ �Է����ּ��� : ");
		int couponCount = sc.nextInt();
		sc.nextLine();

		mm.insertMember(new User(name, age, birth, couponCount));
		// ȸ�� �̸�, ����, ����, �������� ���� �Է¹޾� mm�� insertMember() �޼ҵ�� ������ ȸ�� ��ü�� �ּ� �� ����, ����
		// �ݺ��޴� ����Ͽ� �� �޴�
		// ��ư Ŭ���� �ش��ϴ� �޼ҵ� ȣ��(Ŭ���� ���� ����
		System.out.println("�Է��Ͻ� ������ ȸ������� �Ϸ�Ǿ����ϴ�.");

		while (true) {

			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ��ȭ ��ü ��ȸ");
			System.out.println("3. ��ȭ �����ϱ�");
			System.out.println("4. ��ȭ�� �ܿ��¼� Ȯ���ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println(mm.myPage());
				break;
			case 2:
				mm.selectAll();
				break;
			case 3:
				mm.selectAll();
				reservation();
				break;
			case 4:
				mm.checkSeat();
				break;
			case 9:
				break;
			}
			if (input == 9) {
				System.out.println("���α׷��� �����մϴ�.");
			}
			System.out.println("���Ͻô� �޴��� ��ȣ�� �Է��ϼ���.");
		}
	}

	public void reservation() {

		System.out.println("���� �� ��ȭ ��ȣ�� �����ϼ���.");
		reservationIndex = sc.nextInt();
		sc.nextLine();
		int result = mm.reservation(reservationIndex - 1);
		if (result == 0) {
			System.out.println("���������� ����Ǿ����ϴ�.");
		} else if (result == 1) {
			System.out.println("�Ƶ��� �Բ� ������ �Ұ����մϴ�.");
		} else if (result == 2) {
			System.out.println("������������ ���� ������ �Ұ����մϴ�.");
		} else if (result == 3) {
			System.out.println("���ε� �������� ��ȭ�� ���ŵǾ����ϴ�.");
		}

		// ���� �� ��ȭ��ȣ�� �Է� �޾� mm�� reservation() �޼ҵ�� ����, ������� result�� �޾� ��쿡 ���� ���� �ش��ϴ�
		// ��¹� ��� (Ŭ���� ���� ����)

	}
}
