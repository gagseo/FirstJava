package org.kh.edu;

public class TestDataType {

	public static void main(String[] args) {
		System.out.println(1 + 1);
		System.out.println(1.1 + 1.1);
		System.out.println('1' + '1');
		// �ƽ�Ű �ڵ�ǥ(���۸�)�� 1�� 49�̴�.
		// �׸��Ͽ� 49 + 49 �� 98�� ��µǾ� ���´�.
		System.out.println("1" + "1");
		// ��µ� 11�� ����11�� �ƴϰ� ���ڿ�11�̴�.
		System.out.println("Hello" + 'q');
		System.out.println("Hello" + 3.14);
		System.out.println(10 + 20 + "Hello");
		System.out.println(10 + "Hello" + 20);
		System.out.println("Hello" + 10);
		System.out.println(10 + "Hello");
		System.out.println(10 + (20 + "Hello"));
	}
}
