package thread.test01;

public class Thread04 {

	// Thread ����
	// 1. ����(Running): ����ǰ� �ִ� ����

	// 2. ������(Runnable): �����̶� ����� �� ������, �����층�� ���� �ʾƼ� ��ٸ��� �ִ� ����

	// 3. �Ͻ�����: �����带 �����Ҽ� ���� ����
	// 1) WATTING : wait(), join()
	// 2) TIMED_WATTING : sleep(millisecond)
	// 3) BLOCKED : ����ϰ��� �ϴ� ��ü�� LOCK�� Ǯ���� ���� ����ϴ� ����

	// 4. ����: run�޼��带 ��� �����ϰ� ������ ����

	//
	// Thread�� �����ϴ� �޼���
	// 1. ������ ����
	// 1) start() : ������ ���·� ������ش�. ���� �����층�� ���� ������·� �Ѿ��.
	// 2) Thread.yiled() : �����߿� �ٸ� �����忡�� �纸�ϰ� ��������°� �ȴ�.
	// 3) ObjectŬ������ notify() : wait() ������ �����带 ������� �ٲ��ش�.
	// 4) ThreadŬ������ interrupt() : sleep() �̳� join()�� ���� �Ͻ����� ������ �����带 ��������·� �����.

	// 2. �Ͻ����� ����
	// 1) ThreadŬ������ sleep(millisecond) : ������ �ð����� �����尡 �۵��� �����.
	// 2) ThreadŬ������ join() : ������ �����尡 ����Ǵ� ���� �ٸ� �����带 �����.
	// 3) ObjectŬ������ wait() : notify() ����� ���� �����带 �����·� �д�.

	public static void main(String[] args) {

		MyThread03 m1 = new MyThread03("�߿�");
		MyThread03 m2 = new MyThread03("�۸�");
		
		m1.start();
		try {
			m1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		m2.start();

	}
}
