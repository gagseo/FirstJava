package thread.test01;

//쓰래드 이름 짓기
//쓰래드 스케쥴링

class MyThread03 extends Thread {

	public MyThread03(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.getName() + " = " + i);
		}
		System.out.println(this.getName() + " = " + "끝");
	}
}

public class Thread03 {

	public static void main(String[] args) {

		MyThread03 m1 = new MyThread03("야옹");
		MyThread03 m2 = new MyThread03("멍멍");

		// java의 Thread Scheduling은
		// 1. 우선순위(priority) 방식과
		// 2. 순환할당 방식으로 나뉜다.
		// 순환할당 방식은 cpu가 알아서 순위를 할당하는 방식이다.

		// 우선순위 지정 setPriority(int)
		// 매개변수로 줄 수 있는 수는 1~10 사이의 수이다.
		// default는 5이다.
		// 숫자가 높을 수록 우선순위가 높다.
		m1.setPriority(10);
		m2.setPriority(1);

		m1.start();
		m2.start();
	}
}
