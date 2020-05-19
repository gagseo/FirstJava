package com.kh.method;

public class Static {

	// 접근재한자[예약어] 반환형 메서드명(매개변수)

	// 예약어 static, abstract
	// static : 메서드나 변수 앞에 static을 붙여주면 프로그램이 실행되자마자 바로
	// static영역에 해당 메서드나 변수가 올라간다.
	// static영역에 올라간 데이터들은 프로그램이 종료될 때 까지 내려오지 않는다.
	// 이미 메모리에 올라가 있기 때문에 객체를 생성하는 과정이 필요하지 않다.
	// 다른 클래스에 같은 이름의 static메서드가 있을 수 있기 때문에, 앞에 클래스명을 붙여서
	// 구분해준다.

	// abstract
	// 메서드 구현부가 없는 미완성 메서드이다.
	// abstract메서드가 있는 클래스는 추상클래스가 된다.
	// 상속시 반드시 오버라이드 해야한다.
	// 다음 주 배울 내용이다.

	int i = 10;
	static String name = "서호영";

	public static void staticMethod() {


		System.out.println("Static 클래스의 static메서드 입니다.");
	}

}
