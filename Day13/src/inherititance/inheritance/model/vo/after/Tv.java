package inherititance.inheritance.model.vo.after;

public class Tv extends Product {

	private int inch; // ��ġ

	public Tv() {

	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {

		super(brand, pCode, pName, price); // �θ������ ����
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override // �������̵����ټ� �޾��ֱ�!
	// 1.��ŸȮ������
	// 2.private ��� �ȵǴ� �κе� ����ش�.
	public String information() {
		// �������̵� �ؼ� ������ ���ֱ�
		return super.information() + ", inch = " + inch;

	}
}
