package init;

import java.net.SocketTimeoutException;

public class Init {

	// 필드변수 초기화 순서
	// 인스턴스변수 : jvm기본값 -> 필드변수에 직접 대입한 값 -> 초기화블록 -> 생성자
	// 클래스 변수 : jvm기본값 -> 필드변수에 직접 대입한 값 -> static초기화 블록
	private int nonStaticVar = 10;
	public static int staticVar = 20;

	// static초기화 블록
	// static변수의 값을 초기화 해준다.
	static { // static초기화블록 <- static{}
		System.out.println("static 초기화블록");
		System.out.println("staticVar = 20 : " + staticVar);
		staticVar = 200;
		System.out.println("staticVar = 200 : " + staticVar);
	}

	// 초기화 블록
	// 클래스가 인스턴스화 되는 순간 한번만 호출되어 인스턴스 변수의 값을 초기화 해준다.

	{ // 초기화블록 <- {}

		System.out.println("초기화 블록");
		System.out.println("nonStaticVar = 10 : " + nonStaticVar);
		nonStaticVar = 100;
		System.out.println("nonStaticVar = 100 : " + nonStaticVar);

	}

	public Init() {
		System.out.println("===================================");
		System.out.println("생성자를 통한 초기화");
		System.out.println("nonStaticVar = 100 : " + nonStaticVar);
		nonStaticVar = 1000;
		System.out.println("nonStaticVar = 1000 : " + nonStaticVar);
	}

}
