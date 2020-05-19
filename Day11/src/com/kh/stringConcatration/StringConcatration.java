package com.kh.stringConcatration;

import java.util.Scanner;

public class StringConcatration {

	String str = "KH Academy";

	public void stringConcat() {

		// ==
		// 동일성비교
		// 같은 주소를 바라보고 있는지에 따라 true/false 반환
		String test1 = "ABC";
		String test2 = "ABC"; // test1 과 test2는 같은 주소를 바라보고있다.
		System.out.println(System.identityHashCode(test1));
		System.out.println(System.identityHashCode(test2));
		System.out.println("스트링상수풀에 있는 String객체를 둘다 바라보고 있다." + (test1 == test2));

		String test3 = new String("ABC"); // heap영역에 바로 "ABC"를 만들어 버린다.
		System.out.println(System.identityHashCode(test3));
		System.out.println("heap영역에 올라간 String과 상수풀에 있는 String비교: " + (test1 == test3));

		Scanner sc = new Scanner(System.in);
		System.out.println("ABC를 입력하세요:");
		String test4 = sc.nextLine();
		System.out.println(System.identityHashCode(test4));
		System.out.println(test1 == test4);

		// equals 메서드(String은 equals 사용해라)
		// 동등비교
		// 안에 들어있는 값이 같은지만 확인해서 true/false를 반환.
		// 주소는 상관이 없다.
		// java.lang.String.equals메서드를 활용해서
		// test1과 test3을 비교하는 코드를 작성하세요.

		System.out.println("equals 메서드 : " + test1.equals(test3));

		// Integer.parseInt(String arg)
		// Short.parseShort(String arg)

	}

	// String
	// 문자열 값을 수정할 수 없는 immutable 이다.
	// 문자열 값을 수정하는 작업에 적합하지 않다.
	// 문자열을 수정하면 새로운 주소값을 반환해준다.
	public void stringConcatMethod() {
		str = str.concat(" Java Class");
		System.out.println(str);
		// 출력 : KH Academy Java Class
		// str + "" 로 표현된다.

	}

	// stringBuilder 의 특징
	// 1.문자값을 수정할 수 있다.(mutable 하다)
	// 2.기본 16문자 크기의 buffer를 사용한다. 크기를 조정할 수 있다.
	// -> 내부적으로 크기가 16인 char[]을 생성해놓는다.
	// 쓰래드동기화를 지원하지 않는다.
	public void stringBuilderConcat() {

		String A = "A";
		System.out.println("결합 전 : " + System.identityHashCode(A));
		A += "B";
		System.out.println("결합 후 : " + System.identityHashCode(A));

		StringBuilder sb = new StringBuilder();
		System.out.println("결합 전 : " + System.identityHashCode(sb));
		sb.append(str).append(" 자바 클래스"); // mutable 하다(주소값이 바꾸지 않은것을 확인할 수 있다.)
		System.out.println("결합 전 : " + System.identityHashCode(sb));
		System.out.println(sb);
	}

	// stringBuffer 의 특징
	// 1.문자값을 수정할 수 있다.(mutable 하다)
	// 2.기본 16문자 크기의 buffer를 사용한다. 크기를 조정할 수 있다.
	// -> 내부적으로 크기가 16인 char[]을 생성해놓는다.
	// 쓰래드 동기화를 지원한다. //
	public void stringBufferConcat() {

		StringBuffer sb = new StringBuffer();
		System.out.println("결합 전 : " + System.identityHashCode(sb));
		sb.append(str).append(" Java Class");// mutable 하다(주소값이 바꾸지 않은것을 확인할 수 있다.)
		System.out.println("결합 전 : " + System.identityHashCode(sb));
		System.out.println(sb);

	}

}
