package poly.model.vo;

public class Parent {

	private int x;
	private int y;

	public Parent() {

	}

	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String info() {
		return "�� �θ��";
	}

	@Override
	public String toString() {
		return "Parent [x=" + x + ", y=" + y + "]";
	}

}
