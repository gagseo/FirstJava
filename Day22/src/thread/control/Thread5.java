package thread.control;

public class Thread5 implements Runnable {

	@Override
	public void run() {

		int cnt = 0;
		while (cnt < 10) {
			try {
				Thread.sleep(1000);
				System.out.println((++cnt) + "��");

			} catch (InterruptedException e) {
				System.out.println("���� ��Ȳ �߻� �ߴ�?");
				System.out.println(cnt + "�ʿ� ī��Ʈ ����");
				cnt = 10;
			}
		}
		System.out.println("ī��Ʈ ����");
	}

}
