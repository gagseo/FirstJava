package init;

import java.net.SocketTimeoutException;

public class Init {

	// �ʵ庯�� �ʱ�ȭ ����
	// �ν��Ͻ����� : jvm�⺻�� -> �ʵ庯���� ���� ������ �� -> �ʱ�ȭ��� -> ������
	// Ŭ���� ���� : jvm�⺻�� -> �ʵ庯���� ���� ������ �� -> static�ʱ�ȭ ���
	private int nonStaticVar = 10;
	public static int staticVar = 20;

	// static�ʱ�ȭ ���
	// static������ ���� �ʱ�ȭ ���ش�.
	static { // static�ʱ�ȭ��� <- static{}
		System.out.println("static �ʱ�ȭ���");
		System.out.println("staticVar = 20 : " + staticVar);
		staticVar = 200;
		System.out.println("staticVar = 200 : " + staticVar);
	}

	// �ʱ�ȭ ���
	// Ŭ������ �ν��Ͻ�ȭ �Ǵ� ���� �ѹ��� ȣ��Ǿ� �ν��Ͻ� ������ ���� �ʱ�ȭ ���ش�.

	{ // �ʱ�ȭ��� <- {}

		System.out.println("�ʱ�ȭ ���");
		System.out.println("nonStaticVar = 10 : " + nonStaticVar);
		nonStaticVar = 100;
		System.out.println("nonStaticVar = 100 : " + nonStaticVar);

	}

	public Init() {
		System.out.println("===================================");
		System.out.println("�����ڸ� ���� �ʱ�ȭ");
		System.out.println("nonStaticVar = 100 : " + nonStaticVar);
		nonStaticVar = 1000;
		System.out.println("nonStaticVar = 1000 : " + nonStaticVar);
	}

}
