package inherit.vehicle;

public class Car extends Vehicle { // 부모클래스는 Vehicle

	private int tire; // 바퀴 수

	public Car() {
		super();
	}

	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		this.tire = tire;

	}

	public int getTire() {
		return tire;
	}

	public void setTire(int tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return super.toString() + "Car [tire=" + tire + "]";
	}

}
