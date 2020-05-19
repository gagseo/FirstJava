package throwPrac.view;

import java.util.Scanner;

import myExcepsion.MyExcepsion;
import throwPrac.model.service.Account;
import throwPrac.model.service.BankTransfer;

public class MainMenu {

	Scanner sc = new Scanner(System.in);
	BankTransfer bt = new BankTransfer();
	boolean sessionFlag = true;

	public void bankFunction() {

		int sendMoney = 0;
		int accountNum = 0;
		boolean flg = true;

		while (flg) {
			try {
				if (sessionFlag) {

					System.out.println("���̵� �Է��Ͻʽÿ� : ");
					String id = sc.nextLine();
					System.out.println("��й�ȣ�� �Է��Ͻʽÿ� : ");
					String pw = sc.nextLine();
					Account info = bt.login(id, pw);
					System.out.println(bt.userInfo().getName() + "�� ȯ���մϴ�.");
					sessionFlag = false;
				}

				System.out.println("���� �ܾ� : " + bt.userInfo().getBalance() + "�� �Դϴ�.");
				System.out.println("� ������ �����Ͻðڽ��ϱ�?");
				System.out.println("1. �Ա�");
				System.out.println("2. ���");
				System.out.println("3. �۱�");
				System.out.println("4. �α׾ƿ�");
				System.out.println("9. ���α׷� ����");

				int num = sc.nextInt();
				sc.nextLine();

				switch (num) {
				case 1:
					System.out.println("�Ա��Ͻ� �ݾ��� �Է��ϼ��� : ");
					int money = sc.nextInt();
					bt.save(money);
					break;
				case 2:
					System.out.println("����Ͻ� �ݾ��� �Է��ϼ��� : ");
					int outMoney = sc.nextInt();
					bt.withdraw(outMoney);
					break;
				case 3:
					System.out.println("�۱��Ͻ� ���¹�ȣ : ");
					accountNum = sc.nextInt();
					System.out.println("�۱��Ͻ� �ݾ� : ");
					sendMoney = sc.nextInt();
					bt.transfer(sendMoney, accountNum);
					break;
				case 4:
					sessionFlag = true;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					break;
				case 9:
					flg = false;
					System.out.println("�ý����� ����˴ϴ�.");
					break;
				default:
					System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
				}
			} catch (MyExcepsion e) {

				String msg = e.getMessage();
				switch (msg) {
				case "f01":
					System.out.println("���̵� ��й�ȣ�� Ʋ�Ƚ��ϴ�.");
					break;
				case "f02":
					System.out.println("��ٱݾ��� �ܾ׺��� �����ϴ�.");
					break;
				case "f03":
					System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
					bt.rollback(sendMoney);
					break;
				default:
					System.out.println("�˼����� ������ �߻��߽��ϴ�. �ý��� ����ڿ��� �����ϼ���.");
				}

			}

		}
	}
}
