package throwPrac.model.service;

import myExcepsion.MyExcepsion;

public class BankTransfer {

	private Account[] accounts = new Account[]

	{ new Account("a1", "12345", 123456, "ȫ�浿", 1000000), new Account("a2", "54321", 654321, "�Ӳ���", 100000) };

	private Account userAccount;

	// thorws : �޼��� �ȿ��� �߻��� ���ܸ� �� �޼��带 ȣ���� �޼��忡�� ������.
	// thorw : �Ϻη� ������ �߻���ų�� ����Ѵ�.
	// thorw new(Exception �̸�)
	// ex) thorw new MyException();
	// ex) thorw new MyException("f01");

	public Account login(String id, String pw) throws MyExcepsion {

		boolean err = true;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getId().equals(id) && accounts[i].getPw().equals(pw)) {
				userAccount = accounts[i];
				err = false;
			}
		}

		if (err) {
			throw new MyExcepsion("f01");
		}
		return userAccount;

	}

	public Account userInfo() {

		return userAccount;

	}

	public void save(int money) {

		userAccount.setBalance(userAccount.getBalance() + money);

	}

	public void withdraw(int money) throws MyExcepsion {

		if (userAccount.getBalance() >= money) {
			userAccount.setBalance(userAccount.getBalance() - money);

		} else {
			throw new MyExcepsion("f02");
		}

	}

	public void transfer(int money, int accountNum) throws MyExcepsion {

		send(money);
		receive(accountNum, money);

	}

	private void send(int sendMoney) throws MyExcepsion {

		if (userAccount.getBalance() >= sendMoney) {
			userAccount.setBalance(userAccount.getBalance() - sendMoney);
		} else {
			throw new MyExcepsion("f02");
		}

	}

	private void receive(int accountNum, int receiveMoney) throws MyExcepsion {

		boolean err = true;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNum() == accountNum) {
				accounts[i].setBalance(accounts[i].getBalance() + receiveMoney);
				err = false;
			}
		}
		if (err) {
			throw new MyExcepsion("f03");
		}
	}

	public void rollback(int sendMoney) {

	}
}
