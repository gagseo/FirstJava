package encapsulation;

public class Player {
	// ���� ������ �̰� ���� �ȵȴ�.
	public void play() {
		prepare();
		start();
		playing();
		end();

	}

	private void prepare() {
		System.out.println("���ָ� �غ��մϴ�.");
	}

	private void start() {
		System.out.println("���� �����մϴ�.");
	}

	private void playing() {
		System.out.println("���� ���Դϴ�.");
	}

	private void end() {
		System.out.println("���� �������ϴ�.");
	}
}
