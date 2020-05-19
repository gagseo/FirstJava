package tour_teacher.controller;

import tour_teacher.model.vo.Airline;
import tour_teacher.model.vo.Tourist;

public class TourController {

	private Airline al1 = new Airline("미국행", 3000, 300000);
	private Airline al2 = new Airline("중국행", 2000, 200000);
	private Airline al3 = new Airline("일본행", 1500, 150000);
	private Tourist tt = new Tourist(1000000, 1000);

	// 객체배열 사용
	private Airline[] airs = new Airline[] { al1, al2, al3 };

	public TourController() {

	}

	public boolean isAble(int num) {

		boolean res = true;
		// 객체 배열 사용후 추가 코드
		int idx = num - 1;
		// 사용자가 입력한 값이 1이면 미국행 2이면 중국행 3이면 일본행
		int myAll = tt.getMyMoney();

		// 객체 배열 사용후 코드
		if (myAll < airs[idx].getAirfare()) {
			res = false;
		}

		//
		// 객체 배열 사용전 코드
		// switch (num) {
		// case 1:
		// if (myAll < al1.getAirfare()) {
		// res = false;
		// }
		// break;
		// case 2:
		// if (myAll < al2.getAirfare()) {
		// res = false;
		// }
		// break;
		// case 3:
		// if (myAll < al3.getAirfare()) {
		// res = false;
		// }
		// break;
		// }

		return res;

	}

	// 객체배열 사용후 추가코드
	public void buyTicket(int num) {

		int idx = num - 1;
		int myMoney = tt.getMyMoney() - airs[idx].getAirfare();
		tt.setMyMoney(myMoney);
		int myMile = tt.getMyMile() + airs[idx].getMileage();
		tt.setMyMile(myMile);
	}
	//
	// 객체배열 사용전 코드
	// public void buyTicket1() {
	//
	// int myMoney = tt.getMyMoney() - al1.getAirfare();
	// tt.setMyMoney(myMoney);
	// int myMile = tt.getMyMile() + al1.getMileage();
	// tt.setMyMile(myMile);
	//
	// }
	//
	// public void buyTicket2() {
	//
	// int myMoney = tt.getMyMoney() - al2.getAirfare();
	// tt.setMyMoney(myMoney);
	// int myMile = tt.getMyMile() + al2.getMileage();
	// tt.setMyMile(myMile);
	//
	// }
	//
	// public void buyTicket3() {
	//
	// int myMoney = tt.getMyMoney() - al3.getAirfare();
	// tt.setMyMoney(myMoney);
	// int myMile = tt.getMyMile() + al3.getMileage();
	// tt.setMyMile(myMile);
	// }

	public int bringMyMoney() {

		return tt.getMyMoney();
	}

	public int bringMyMile() {

		return tt.getMyMile();
	}
}
