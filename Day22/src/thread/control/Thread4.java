package thread.control;

public class Thread4 implements Runnable {

	// sleep() : ������ �ð����� �����带 �Ͻ����� ��Ű�� �޼���
	// static���� ����Ǿ� �ֱ� ������ Thread.sleep()���� ȣ�� �� �� �ִ�.
	// �Ͻ����� ��Ű���� �ϴ� ������ ���ο��� ����Ѵ�.(run() �޼ҵ� ���ο��� ����Ѵ�.)

	// interrupt() : ȣ��� �Ͻ� ���� ���¸� �������ش�.
	// �����尡 �Ͻ��������¿� ���� �� interrupt() �޼��带 ����ϸ�
	// InterruptedException �� �߻���Ų��.

	@Override
	public void run() {

		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "��");
			}
			System.out.println("ī��Ʈ ����");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
