package thread.control;

import java.util.Scanner;

public class InterruptSample {

	public void sleepInterrupt() {

		Thread5 th5 = new Thread5();
		Thread thread = new Thread(th5);
		thread.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("�ƹ� ���̳� �Է��ϼ��� >> ");
		String input = sc.nextLine();
		System.out.println("�Է��� ��: " + input);

		// Thread5�� �������� �����忡 ���ͷ�Ʈ�� ȣ��
		// Thread5�� �Ͻ����� ����(�� sleep() ) ������ ��
		// ���ͷ�Ʈ �޼��带 ����ϸ� ���ܰ� �߻��ϰ� �ȴ�.
		thread.interrupt();

	}
}
