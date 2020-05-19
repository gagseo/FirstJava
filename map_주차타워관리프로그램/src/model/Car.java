package model;

public class Car {

	private int carNum; // 차량 번호
	private int carType; // 차량 종류
	private String owner; // 차주 이름

	public Car() {

	}

	public Car(int carNum, int carType, String owner) {
		super();
		this.carNum = carNum;
		this.carType = carType;
		this.owner = owner;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		
		if(carType == 1) {
			System.out.println("경차");
		}else if (carType == 2) {
			System.out.println("세단");
		}else if (carType == 3) {
			System.out.println("SUV");
		}else if (carType == 4) {
			System.out.println("트럭");
		}
		return "차량 정보 [차량 번호 =" + carNum + ", 차량 타입 =" + carType + ", 차주 =" + owner + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carNum;
		result = prime * result + carType;
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carNum != other.carNum)
			return false;
		if (carType != other.carType)
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

}
