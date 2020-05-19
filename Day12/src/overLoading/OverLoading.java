package overLoading;

public class OverLoading {

	// 오버로딩
	// 이름이 같은 메서드를 여러게 만드는 것.
	// ->하나의 이름에 여러 메서드를 과적했다.
	// 조건 : 매개변수가 달라야 한다.
	// -> 매개변수의 타입(자료형) 또는 개수 또는 순서가 달라야 한다.
	// 접근제한자, 예약어, 반환형은 영향을 미치지 않는다.

	public void olTest() {

	}

	public void olTest(int a) { // 매개변수가 생겼다.

	}

	/*
	 * publci void olTest(int b) { //변수명은 상관이 없다. 종류가 달라야 한다.//에러뜸 }
	 */

	public void olTest(int a, int b) { // 매개변수에 개수가 달라져서 성립

	}

	public void olTest(int a, String b) { // 매개변수의 종류가 달라져서 성립

	}

	public void olTest(String b, int a) { // 매개변수의 순서가 달라도 성립

	}

	static String olTest(int a, int b, String c) {
		return c;
	}
}
