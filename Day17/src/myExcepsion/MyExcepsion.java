package myExcepsion;

public class MyExcepsion extends Exception {

	public MyExcepsion() {

	}

	public MyExcepsion(String msg) {
		super(msg);
		// �θ�����ڿ� ���ڿ��� �Ѱ��ָ�
		// Throwable�� �ִ� ����(detailMessage)�� ���� �������ش�.
		// detailMessage�� ���� �־��ָ� e.getMessage()�޼��带 ����
		// �� ���� ��� �� �� �ִ�.
	}
}
