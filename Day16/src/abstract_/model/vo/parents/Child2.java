package abstract_.model.vo.parents;

public class Child2 extends Parent {

	private int z;

	public Child2() {

	}

	public Child2(int x, int y, int z) {
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
		// TODO Auto-generated method stub
		return "나 두번째 자식이야";
	}

}
