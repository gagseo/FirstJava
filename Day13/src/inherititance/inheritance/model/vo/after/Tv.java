package inherititance.inheritance.model.vo.after;

public class Tv extends Product {

	private int inch; // 인치

	public Tv() {

	}

	public Tv(String brand, String pCode, String pName, int price, int inch) {

		super(brand, pCode, pName, price); // 부모생성자 먼저
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override // 오버라이드언어텐션 달아주기!
	// 1.오타확인해줌
	// 2.private 상속 안되는 부분도 잡아준다.
	public String information() {
		// 오버라이딩 해서 재정의 해주기
		return super.information() + ", inch = " + inch;

	}
}
