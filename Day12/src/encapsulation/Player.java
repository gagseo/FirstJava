package encapsulation;

public class Player {
	// 시험 볼때는 이걸 쓰면 안된다.
	public void play() {
		prepare();
		start();
		playing();
		end();

	}

	private void prepare() {
		System.out.println("연주를 준비합니다.");
	}

	private void start() {
		System.out.println("연주 시작합니다.");
	}

	private void playing() {
		System.out.println("연주 중입니다.");
	}

	private void end() {
		System.out.println("연주 끝났습니다.");
	}
}
