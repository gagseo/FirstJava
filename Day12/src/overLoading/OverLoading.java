package overLoading;

public class OverLoading {

	// �����ε�
	// �̸��� ���� �޼��带 ������ ����� ��.
	// ->�ϳ��� �̸��� ���� �޼��带 �����ߴ�.
	// ���� : �Ű������� �޶�� �Ѵ�.
	// -> �Ű������� Ÿ��(�ڷ���) �Ǵ� ���� �Ǵ� ������ �޶�� �Ѵ�.
	// ����������, �����, ��ȯ���� ������ ��ġ�� �ʴ´�.

	public void olTest() {

	}

	public void olTest(int a) { // �Ű������� �����.

	}

	/*
	 * publci void olTest(int b) { //�������� ����� ����. ������ �޶�� �Ѵ�.//������ }
	 */

	public void olTest(int a, int b) { // �Ű������� ������ �޶����� ����

	}

	public void olTest(int a, String b) { // �Ű������� ������ �޶����� ����

	}

	public void olTest(String b, int a) { // �Ű������� ������ �޶� ����

	}

	static String olTest(int a, int b, String c) {
		return c;
	}
}
