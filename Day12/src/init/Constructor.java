package init;

public class Constructor {

	String memberStr = "";
	int memberInt = 0;

	// 기본생성자는 jvm이 자동으로 만들어 준다.
	// 생성자는 클래스가 인스턴스화 될 때 호출 된다.
	// 필드변수를 초기화하는 용도로 사용하기도 한다.
	// 클래스 생성시 한번만 실행햐야하는 코드가 있을 경우 생성자에 넣을 수 있다.
	public Constructor() {
		super();
	}

	// 매개변수가 있는 생성자를 만들면, jvm이 기본생성자를 자동으로 만들지 않는다.
	// 생성자도 오버로딩이 가능하다.
	// 오버로딩은 한클래스 내에서 같은 이름으로 여러 메서드를 만드는 것을 의미한다.
	// 오버로딩은 매개변수의 개수, 타입, 순서에 영향을 받는다.
	public Constructor(String memberStr, int memberInt) {

		// this는 해당 인스턴스를 지칭하는 말이다.
		// this를 통해 변수나 메서드를 호출 할 수 있다.
		this.memberStr = memberStr;
		this.memberInt = memberInt;
		this.test();

	}

	public void test() {
		System.out.println("Constructor클래스의 test메서드 입니다.");
	}
}
