package thread.control;

import java.util.Scanner;

public class InterruptSample {

	public void sleepInterrupt() {

		Thread5 th5 = new Thread5();
		Thread thread = new Thread(th5);
		thread.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("아무 값이나 입력하세요 >> ");
		String input = sc.nextLine();
		System.out.println("입력한 값: " + input);

		// Thread5로 동작중인 쓰레드에 인터럽트를 호출
		// Thread5가 일시중지 상태(즉 sleep() ) 상태일 때
		// 인터럽트 메서드를 사용하면 예외가 발생하게 된다.
		thread.interrupt();

	}
}
