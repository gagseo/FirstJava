package poly.model.vo;

public class Child1 extends Parent {

	private int z;

	public Child1() {

	}

	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String info() {
		return "나 첫번째 자식이야";
	}
}
