package thread.test01;

//Thread �����ϴ¹�
// 1. ThreadŬ���� ��ӹޱ�
// 2. Runnable �������̽� �����ϱ�

// Thread, Runnable ����
// Runnable �������̽��� ������ȭ �� �� �ִ� run() �޼��带 ������ �ִ�.
// Tread Ŭ������ Runnable �������̽��� �����ϰ� ������
// �����带 Ȱ��ȭ �ϴ� start()�޼��带 ������ �ִ�.
// Thread Ŭ������ Tread�� ���¸� ������ �� �ִ� �޼��带 ������ �ִ�.

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("i= " + i);
		}
	}

}

public class Thread00 {

	public static void main(String[] args) {

		// ���ξ����� �̸� ����
		// ���μ����� ��� �����尡 �۾��� ������ �����Ѵ�.
		System.out.println("���� �������� �������� �̸� �θ��� : " + Thread.currentThread().getName());

		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();

		System.out.println("MyThread����");
		m1.start();
		m2.start();
	}
}
