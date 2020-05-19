package inherit.vehicle;

public class Ship extends Vehicle { // �θ�Ŭ������ Vehicle

	private int propeller; // �����緯 ��

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
