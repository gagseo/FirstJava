package init;

public class Constructor {

	String memberStr = "";
	int memberInt = 0;

	// �⺻�����ڴ� jvm�� �ڵ����� ����� �ش�.
	// �����ڴ� Ŭ������ �ν��Ͻ�ȭ �� �� ȣ�� �ȴ�.
	// �ʵ庯���� �ʱ�ȭ�ϴ� �뵵�� ����ϱ⵵ �Ѵ�.
	// Ŭ���� ������ �ѹ��� ��������ϴ� �ڵ尡 ���� ��� �����ڿ� ���� �� �ִ�.
	public Constructor() {
		super();
	}

	// �Ű������� �ִ� �����ڸ� �����, jvm�� �⺻�����ڸ� �ڵ����� ������ �ʴ´�.
	// �����ڵ� �����ε��� �����ϴ�.
	// �����ε��� ��Ŭ���� ������ ���� �̸����� ���� �޼��带 ����� ���� �ǹ��Ѵ�.
	// �����ε��� �Ű������� ����, Ÿ��, ������ ������ �޴´�.
	public Constructor(String memberStr, int memberInt) {

		// this�� �ش� �ν��Ͻ��� ��Ī�ϴ� ���̴�.
		// this�� ���� ������ �޼��带 ȣ�� �� �� �ִ�.
		this.memberStr = memberStr;
		this.memberInt = memberInt;
		this.test();

	}

	public void test() {
		System.out.println("ConstructorŬ������ test�޼��� �Դϴ�.");
	}
}
