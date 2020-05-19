package com.kh.method;

public class MethodTest {

	public void methodTest() {

		AccessModifier amf = new AccessModifier();

		// AccessModifier 클래스의 publicMethod 호출해보기.
		// amf.publicMethod();
		// AccessModifier 클래스의 protectedMethod 호출해보기.
		// amf.protectedMethod();
		// AccessModifier 클래스의 defaultMethod 호출해보기.
		// amf.defaultMethod();
		// AccessModifier 클래스의 privateMethod 호출해보기.
		// amf.privateMethod();

		// -----------------------------------------------
		// return 클래스의 sub메서드를 호출한 다음 매개변수에 원하는 값을 넣고
		// 메서드가 돌려주는 값을 알맞은 변수에 담아 결과값 출력해보기.
		Return rt = new Return();
		int i = 10;
		int j = 20;
		int res = rt.sub(i, j);

		System.out.println(res);
		//위의 출려문과 아래출력문이 같다
		System.out.println(rt.sub(10, 20));

		// return 클래스의 div메서드를 호출한 다음 매개변수에 원하는 값을 넣고
		// 메서드가 돌려주는 값을 알맞은 변수에 담아 결과값 출력해보기.
		Return rt1 = new Return();
		int i1 = 10;
		int j1 = 20;
		double res1 = rt1.div(i1, j1);
		
		System.out.println(res1);
		//위의 출려문과 아래출력문이 같다
		System.out.println(rt1.div(i1, j1));
		
		// return 클래스의 capital메서드를 호출한 다음 매개변수에 원하는 값을 넣고
		// 메서드가 돌려주는 값을 알맞은 변수에 담아 결과값 출력해보기.
		Return rt2 = new Return();
		char ch = 'A';
		char res2 = rt2.capital(ch);
		
		System.out.println(res2);
		//위의 출려문과 아래출력문이 같다
		System.out.println(rt2.capital(ch));
		
		//--------------------------------------------
		
		
		//static 메서드 실행해보기
		Static.staticMethod();
		Return.staticMethod();

	}

	public void staticTest() {

		System.out.println("바이트의 최소값은 " + Byte.MIN_VALUE + "입니다.");
		//String name = "서호영";
		//참조형 변수에서 Stack영역에서 무조건 4byte로 인식
		//String 변수는 크기가 몇인지 모르기 때문에 heap에 저장
		
		//static 을 쓰면 메모리측면에서 이득일 수도 있지만, 속도 측면에선 이득이다.
		//static은 공유의 의미
		
		Static.name = "서호릭";
		System.out.println("저의 이름은 " + Static.name + "입니다.");
	}

	public void staticTest1() {

		System.out.println("short의 최소값은 " + Short.MIN_VALUE + "입니다.");
		System.out.println("저의 이름은 " + Static.name + "입니다.");
	}

	public void staticTest2() {

		System.out.println("int의 최소값은 " + Integer.MIN_VALUE + "입니다.");
		System.out.println("저의 이름은 " + Static.name + "입니다.");
	}

}
