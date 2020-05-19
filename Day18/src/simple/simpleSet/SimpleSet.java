package simple.simpleSet;

public class SimpleSet {

	int arraySize = 31; // 소수로 잡음
	int arrIdx = 0;
	Object[] sHashSet;

	public SimpleSet() {
		sHashSet = new Object[arraySize];
	}

	public void add(Object val) {

		// 순서보장 안된다. 랜덤으로 불러온다
		// 중복 저장 안된다. 덮어져서 저장
		int idx = simpleHashMethod(val, arraySize);
		if (sHashSet[idx] == null) {
			sHashSet[idx] = val;
			arrIdx++;
		}

	}

	private int simpleHashMethod(Object val, int arraySize) {
		// val의 해시코드(주소의 해싱값)을 받음
		int res = Math.abs(val.hashCode());
		// 받은 해싱값을 소수인 31로 나눈 나머지를 res에 담음
		// 31은 소수이기 때문에 1과 자기자신으로만 나누어 떨어진다.
		res %= arraySize;

		return res;
	}

}
