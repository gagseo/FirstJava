package abstract_.model.vo.parents;

//추상클래스 
public abstract class Parent {

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

	public abstract String info();

	@Override
	public String toString() {
		return "Parent [x=" + x + ", y=" + y + "]";
	}

}
