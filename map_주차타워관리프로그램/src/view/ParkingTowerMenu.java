package view;

import java.awt.image.RescaleOp;
import java.util.Map;
import java.util.Scanner;

import controller.ParkingTowerManager;
import model.Car;

public class ParkingTowerMenu {

	Scanner sc = new Scanner(System.in);
	private ParkingTowerManager ptm = new ParkingTowerManager();

	public ParkingTowerMenu() {

	}

	public void mainMenu() {

		while (true) {

			System.out.println("=== *주차 타워 관리*===");
			System.out.println("1.차량 주차");
			System.out.println("2.전체 출력");
			System.out.println("3.차량 출차");
			System.out.println("4.주차 차량 검색");
			System.out.println("0.끝내기");
			System.out.println("메뉴 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				insertCar();
				break;
			case 2:
				selectMap();
				break;
			case 3:
				deleteCar();
				break;
			case 4:
				searchCar();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못입력 하셨습니다.");
				break;
			}

		}

	}

	public void insertCar() {

		System.out.println("차량 번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		System.out.println("차량 타입(1:경차/2:세단/3:SUV/4.:트럭): ");
		int carType = sc.nextInt();
		sc.nextLine();
		System.out.println("차주 : ");
		String owner = sc.nextLine();

		// 위에서 입력 받은 carNum, carType, owner를 매개변수로 한 Car 객체 생성 (car)
		// ParkingTowerManager의 insertCar 메소드로 car 전달
		ptm.insertCar(new Car(carNum, carType, owner));
	}

	public void selectMap() {

		// ParkingTowerManager의 selectMap() 메소드 호출
		// 리턴 값 전달 받음 (carMap)
		Map<Integer, Car> carMap = ptm.selectMap();
		
		if (!carMap.isEmpty()) {
			// carMap가 비어있지 않을 경우 >> 전체출력
			System.out.println(carMap);
		} else {
			// carMap가 비어 있을 경우 >> “주차된 차량이 없습니다.”출력
			System.out.println("주차된 차량이 없습니다.");
		}

	}

	public void deleteCar() {
		
		System.out.println("주차 번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();

		// ParkingTowerManager의 deleteCar 메소드로 parkingNo 전달
		//  리턴 값 전달 받음 (res)
		int res = ptm.deleteCar(carNum);

		if (res == 1) {
			// res가 null이 아닐 경우 >> res 출력, “차량 출차 완료!” 출력
			System.out.println("차량 출차 완료");
			
		} else {
			// res가 null일 경우 >> “입력하신 차량이 주차되어있지 않습니다.”출력
			System.out.println("입력하신 차량이 주차되어있지 않습니다.");
		}

	}

	public void searchCar() {

		System.out.println("주차 차량 검색(차주입력) : ");
		String owner = sc.nextLine();

		// ParkingTowerManager의 searchCar 메소드로 owner 전달
		
		//  리턴 값 전달 받음 (searchMap)

		if (ptm.selectMap() != null) {
			// searchMap가 비어있지 않을 경우 >> 전체출력
			System.out.println(ptm.searchCar(owner));
		} else {
			// searchMap가 비어 있을 경우 >> “검색한 차량이 주차 되어 있지 않습니다.”출력
			System.out.println("검색한 차량이 주차 되어 있지 않습니다.");
		}

	}

}
