package inherit.vehicle;

public class Ship extends Vehicle { // 부모클래스는 Vehicle

	private int propeller; // 프로펠러 수

	public Ship() {
		super();
	}

	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind);
		this.propeller = propeller;
	}

	public int getPropeller() {
		return propeller;
	}

	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}

	@Override
	public String toString() {
		return super.toString() + "Ship [propeller=" + propeller + "]";
	}

}
