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

					System.out.println("아이디를 입력하십시오 : ");
					String id = sc.nextLine();
					System.out.println("비밀번호를 입력하십시오 : ");
					String pw = sc.nextLine();
					Account info = bt.login(id, pw);
					System.out.println(bt.userInfo().getName() + "님 환영합니다.");
					sessionFlag = false;
				}

				System.out.println("현재 잔액 : " + bt.userInfo().getBalance() + "원 입니다.");
				System.out.println("어떤 업무를 수행하시겠습니까?");
				System.out.println("1. 입금");
				System.out.println("2. 출금");
				System.out.println("3. 송금");
				System.out.println("4. 로그아웃");
				System.out.println("9. 프로그램 종료");

				int num = sc.nextInt();
				sc.nextLine();

				switch (num) {
				case 1:
					System.out.println("입금하실 금액을 입력하세요 : ");
					int money = sc.nextInt();
					bt.save(money);
					break;
				case 2:
					System.out.println("출금하실 금액을 입력하세요 : ");
					int outMoney = sc.nextInt();
					bt.withdraw(outMoney);
					break;
				case 3:
					System.out.println("송금하실 계좌번호 : ");
					accountNum = sc.nextInt();
					System.out.println("송금하실 금액 : ");
					sendMoney = sc.nextInt();
					bt.transfer(sendMoney, accountNum);
					break;
				case 4:
					sessionFlag = true;
					System.out.println("로그아웃 되었습니다.");
					break;
				case 9:
					flg = false;
					System.out.println("시스템이 종료됩니다.");
					break;
				default:
					System.out.println("정확한 숫자를 입력해주세요.");
				}
			} catch (MyExcepsion e) {

				String msg = e.getMessage();
				switch (msg) {
				case "f01":
					System.out.println("아이디나 비밀번호가 틀렸습니다.");
					break;
				case "f02":
					System.out.println("출근금액이 잔액보다 많습니다.");
					break;
				case "f03":
					System.out.println("계좌번호가 존재하지 않습니다.");
					bt.rollback(sendMoney);
					break;
				default:
					System.out.println("알수없는 에러가 발생했습니다. 시스템 담당자에게 문의하세요.");
				}

			}

		}
	}
}
