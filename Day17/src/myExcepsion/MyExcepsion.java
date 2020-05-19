package myExcepsion;

public class MyExcepsion extends Exception {

	public MyExcepsion() {

	}

	public MyExcepsion(String msg) {
		super(msg);
		// 부모생성자에 문자열을 넘겨주면
		// Throwable에 있는 변수(detailMessage)에 값을 대입해준다.
		// detailMessage에 값을 넣어주면 e.getMessage()메서드를 통해
		// 이 값을 출력 할 수 있다.
	}
}
