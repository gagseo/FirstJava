package thread.test01;

public class Thread04 {

	// Thread 상태
	// 1. 실행(Running): 실행되고 있는 상태

	// 2. 실행대기(Runnable): 당장이라도 실행될 수 있지만, 스케쥴링이 되지 않아서 기다리고 있는 상태

	// 3. 일시정지: 쓰래드를 실행할수 없는 상태
	// 1) WATTING : wait(), join()
	// 2) TIMED_WATTING : sleep(millisecond)
	// 3) BLOCKED : 사용하고자 하는 객체의 LOCK이 풀릴때 까지 대기하는 상태

	// 4. 중지: run메서드를 모드 실행하고 중지된 상태

	//
	// Thread를 제어하는 메서드
	// 1. 실행대기 상태
	// 1) start() : 실행대기 상태로 만들어준다. 이후 스케쥴링에 의해 실행상태로 넘어간다.
	// 2) Thread.yiled() : 실행중에 다른 쓰레드에게 양보하고 실행대기상태가 된다.
	// 3) Object클래스의 notify() : wait() 상태인 쓰레드를 실행대기로 바꿔준다.
	// 4) Thread클래스의 interrupt() : sleep() 이나 join()에 의해 일시정지 상태인 쓰레드를 싱행대기상태로 만든다.

	// 2. 일시정지 상태
	// 1) Thread클래스의 sleep(millisecond) : 지정된 시간동안 쓰레드가 작동을 멈춘다.
	// 2) Thread클래스의 join() : 지정된 쓰레드가 실행되는 동안 다른 쓰레드를 멈춘다.
	// 3) Object클래스의 wait() : notify() 실행시 까지 쓰레드를 대기상태로 둔다.

	public static void main(String[] args) {

		MyThread03 m1 = new MyThread03("야옹");
		MyThread03 m2 = new MyThread03("멍멍");
		
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
