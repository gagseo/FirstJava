package com.kh.stringMethod;

import java.util.Arrays;

public class StringMethod {

	String str = "    The String class represents character strings    ";

	public void controllerMethod() {

		// 1번
		int length = lengthTest();
		System.out.println("length : " + length);
		// 2번
		String toUpperCase = toUpperCaseTest();
		System.out.println("toUpperCase : " + toUpperCase);
		// 3번
		String toLowerCase = toLowerCaseTest();
		System.out.println("toLowerCase : " + toLowerCase);
		// 4번
		int indexOf = indexOfTest();
		System.out.println("indexOf : " + indexOf);
		// 7번
		char[] toCharArray = toCharArrayTest();
		System.out.println(Arrays.toString(toCharArray));
		// 8번
		String trim = trimTest();
		System.out.println("trim : " + trim);

	}

	// 1. str의 길이
	// java.lang.String.length();
	private int lengthTest() {
		int res = str.length();
		return res;

	}

	// 2.str을 모두 대문자로 바꿔보자.
	// java.lang.String.toUpperCase()
	private String toUpperCaseTest() {
		String res = str.toUpperCase();
		return res;
	}

	// 3.str을 모두 소문자로 바꿔보다.
	// java.lang.String.toLowerCase()
	private String toLowerCaseTest() {
		String res = str.toLowerCase();
		return res;
	}

	// 4.str에서 첫번째 c의 인덱스 위치.
	// java.lang.String.indexOf();
	private int indexOfTest() {
		int res = str.indexOf('c');
		return res;
	}

	// 5.str에서 "Class"를 "java"로 바꿔서 출력
	// java.lang.String.replace();
	private void replaceTest() {
		System.out.println(str.replace("Class", "java"));
	}

	// 6.str에서 "string"을 "스트링"으로 바꿔서 출력
	// java.lang.String.replace();
	private void replaceTest2() {
		System.out.println(str.replace("string", "스트링"));
	}

	// 7. str을 char[] 형태로 출력
	// java.lang.String.toCharArray();
	private char[] toCharArrayTest() {
		char[] res = str.toCharArray();
		return res;
	}

	// 8. str을 앞 뒤 공백을 제거한 후 출력
	// java.lang.String.trim();
	private String trimTest() {
		String res = str.trim();
		return res;
	}

	// test1 : character를 찾아서 대문자로 변환한 후 전체 출력
	// java.lang.String.substring();
	public void test1() {

		// 강사코드
		String target = "charater";
		int start = str.indexOf("character"); // "character"의 시작 찾기
		int end = "character".length() + start; // "character" 의 끝 찾기
		String upper = str.substring(start, end).toUpperCase();
		System.out.println(str.replace(target, upper));

		// 나의 코드
		// System.out.println(str.replace(str.substring(32, 41),
		// str.substring(32,41).toUpperCase()));

	}

	// test2 : 전체 역순으로 출력하기.
	public void test2() {

		// 강사코드
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		// 다른 사람 풀이 (위와 같은 답)
		// for(int i = str.length() - 1; i >= 0; i--) {
		// System.out.println(str.charAt(i));
		// }

	}

}
