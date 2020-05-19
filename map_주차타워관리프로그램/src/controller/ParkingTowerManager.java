package controller;

import java.util.HashMap;
import java.util.Map;

import model.Car;

public class ParkingTowerManager {

	private HashMap<Integer, Car> carMap = new HashMap<>();
	private int parkingNo = 0;

	public ParkingTowerManager() {

	}

	public void insertCar(Car car) {

		// 차량이 추가될 때 Map의 key값을 주차 번호로하고 value값을 Car객체로한다.
		// 이때 키값은 parkingNO를 1씩 추가하면 사용
		// carMap에 put을 사용하여 차량 추가
		carMap.put(parkingNo++, car);

	}

	public Map<Integer, Car> selectMap() {

		return carMap;

	}

	public int deleteCar(int parkingNo) {
		int res = 0;
		// carMap을 entrySet()을 통해 Set타입으로 바꿔주고

		// for문을 통해 내가 전달받은 carNum값을을 getValue()와 비교후 존재 하는 경우 삭제한다.
		for (int i = 0; i < carMap.size(); i++) {
			if (carMap.get(i).getCarNum() == parkingNo) {
				// 성공적으로 삭제 할 경우 1 리턴
				res = 1;
				carMap.remove(i);
			}
		}
		// 삭제 되지 않은 경우 즉, 존재하는 차량 번호가 없는 경우 0 리턴

		return res;

	}

	public Map<Integer, Car> searchCar(String owner) {
		Map<Integer, Car> searchMap = new HashMap<Integer, Car>();

//		Set<Map.Entry<Integer, Car>> it = carMap.entrySet();
//
//		for (Entry<Integer, Car> e : it) {
//			if (e.getValue().getOwner().contains(owner)) {
//				searchMap.put(e.getKey(), e.getValue());
//			}
//		}

		// 직관적으로
		for (int i = 0; i < carMap.size(); i++) {
			if (carMap.get(i).getOwner().equals(owner)) {
				searchMap.put(i,
						new Car(carMap.get(i).getCarNum(), carMap.get(i).getCarType(), carMap.get(i).getOwner()));

			}
		}

		// entry의 getValue() 중 전달받은 owner을 포함한 차량이 있을 경우
		// searchMap에 entry의 getKey()값과 entry의 getValue()값을 가지고 저장
		// searchMap 리턴

		return searchMap;

	}

}
