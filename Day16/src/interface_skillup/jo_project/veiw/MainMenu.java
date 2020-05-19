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

		System.out.println("�̸��� �Է��ϼ���. : ");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���. :");
		int age = sc.nextInt();
		sc.nextLine();

		// �����κ�
		if (age < 20) {
			m.insertMember(new Student(name, age, 15000, 0, 0, 0, 5));
		} else {
			m.insertMember(new Adult(name, age, 50000, 0, 0, 0, 3));
		}
		m.welcomeMessage();

		while (true) {
			System.out.println("---�޴� ---");
			System.out.println("1. ����������");
			System.out.println("2. ��ǰ����");
			System.out.println("3. ����� �����ϱ�");
			System.out.println("4. ���� ���� ����");
			System.out.println("9. ���α׷� �����ϱ�");
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
				System.out.println("���α׷� �����ϱ�");
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
			if (num == 9) {
				System.out.println("���α׷� �����ϱ�");
				break;
			}
		}
	}

	public void showMember() {
		m.showMember(0);
	}

	public void buyProduct() {
		m.showProduct();
		System.out.println("�����ǰ�� �����Ͻðڽ��ϱ�?: ");
		int index = sc.nextInt();
		sc.nextLine();

		switch (m.buyProduct(index - 1)) {
		case 'n':
			System.out.println("���θ� ���Ű� ������ ��ǰ�Դϴ�.");
			break;
		case 'y':
			System.out.println("��ǰ�� ���������� ���ŵǾ����ϴ�. \n ������ 1�� �����Ǿ����ϴ�.");
			break;
		case 's':
			System.out.println("�˼��մϴ�. �ش��ǰ�� ��� �����ϴ�.");
			break;
		case 'm':
			System.out.println("�ܾ��� �����մϴ�.");
			break;
		}
	}

	public void openLuckyBox() {
		m.openLuckyBox();
	}

	public void showBuyList() {
		m.showBuyList();
	}

	// 1���� ���� ȸ��, 1���� �л�ȸ���� �����Ͽ� Member�� �ʱ�ȭ ��
	// �л� ȸ�����Դ�, ���� �� �л� ���� ������ 5�� �����ϰ�,
	// ���� ȸ�����Դ�, ���� �� ���� ������ 3�� �����մϴ�.
	// ���� 1õ�� �̻� ���� �� �ű� ������ 1�� ����˴ϴ�.
	// ���� Ƚ�� 5ȸ���� ������ 1�� ����˴ϴ�.
	// ������ ���� 10�� �̻��� �ǰų� ���� �ݾ� 1������ �Ǹ� ("VIPȸ���� �Ǽ̽��ϴ�.") ���

}
