package tour.controller;

import tour.model.vo.Airline;
import tour.model.vo.Tourist;

public class TourController {

	private Airline al1 = new Airline("�̱���", 3000, 300000);
	private Airline al2 = new Airline("�߱���", 2000, 200000);
	private Airline al3 = new Airline("�Ϻ���", 1500, 150000);
	private Tourist tt = new Tourist(1000000, 1000);

	public TourController() {

	}

	public boolean isAble(int num) {

		// �������κ� ����
		num = tt.getMyMoney();

		if (num >= al1.getAirfare() || num >= al2.getAirfare() || num >= al3.getAirfare()) {
			return true;
		} else if (num == 0) {
			return false;
		} else {
			return false;
		}

		// ���� �ݾ����� Ƽ�ϱ��Ű� �Ұ��� �ϸ�
		// "���� ���� �ݾ��� �����մϴ�." ���
	}

	public void buyTiket1() {
		tt.setMyMoney(tt.getMyMoney() - al1.getAirfare());
		tt.setMyMile(tt.getMyMile() + al1.getMileage());
	}

	public void buyTiket2() {
		tt.setMyMoney(tt.getMyMoney() - al2.getAirfare());
		tt.setMyMile(tt.getMyMile() + al2.getMileage());
	}

	public void buyTiket3() {
		tt.setMyMoney(tt.getMyMoney() - al3.getAirfare());
		tt.setMyMile(tt.getMyMile() + al3.getMileage());
	}

	public int bringMyMoney() {

		return tt.getMyMoney();
	}

	public int bringMyMil() {
		return tt.getMyMile();
	}
}
