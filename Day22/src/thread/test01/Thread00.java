package thread.test01;

//Thread 생성하는법
// 1. Thread클래스 상속받기
// 2. Runnable 인터페이스 구현하기

// Thread, Runnable 차이
// Runnable 인터페이스는 스래드화 될 수 있는 run() 메서드를 가지고 있다.
// Tread 클래스는 Runnable 인터페이스를 구현하고 있으며
// 쓰래드를 활성화 하는 start()메서드를 가지고 있다.
// Thread 클래스는 Tread의 상태를 제어할 수 있는 메서드를 가지고 있다.

class MyThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("i= " + i);
		}
	}

}

public class Thread00 {

	public static void main(String[] args) {

		// 메인쓰래드 이름 찍어보기
		// 프로세스는 모든 쓰래드가 작업을 끝내면 종료한다.
		System.out.println("현재 실행중인 쓰래드의 이름 부르기 : " + Thread.currentThread().getName());

		MyThread1 m1 = new MyThread1();
		MyThread1 m2 = new MyThread1();

		System.out.println("MyThread시작");
		m1.start();
		m2.start();
	}
}
