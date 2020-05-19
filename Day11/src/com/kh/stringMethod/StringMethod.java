package com.kh.stringMethod;

import java.util.Arrays;

public class StringMethod {

	String str = "    The String class represents character strings    ";

	public void controllerMethod() {

		// 1��
		int length = lengthTest();
		System.out.println("length : " + length);
		// 2��
		String toUpperCase = toUpperCaseTest();
		System.out.println("toUpperCase : " + toUpperCase);
		// 3��
		String toLowerCase = toLowerCaseTest();
		System.out.println("toLowerCase : " + toLowerCase);
		// 4��
		int indexOf = indexOfTest();
		System.out.println("indexOf : " + indexOf);
		// 7��
		char[] toCharArray = toCharArrayTest();
		System.out.println(Arrays.toString(toCharArray));
		// 8��
		String trim = trimTest();
		System.out.println("trim : " + trim);

	}

	// 1. str�� ����
	// java.lang.String.length();
	private int lengthTest() {
		int res = str.length();
		return res;

	}

	// 2.str�� ��� �빮�ڷ� �ٲ㺸��.
	// java.lang.String.toUpperCase()
	private String toUpperCaseTest() {
		String res = str.toUpperCase();
		return res;
	}

	// 3.str�� ��� �ҹ��ڷ� �ٲ㺸��.
	// java.lang.String.toLowerCase()
	private String toLowerCaseTest() {
		String res = str.toLowerCase();
		return res;
	}

	// 4.str���� ù��° c�� �ε��� ��ġ.
	// java.lang.String.indexOf();
	private int indexOfTest() {
		int res = str.indexOf('c');
		return res;
	}

	// 5.str���� "Class"�� "java"�� �ٲ㼭 ���
	// java.lang.String.replace();
	private void replaceTest() {
		System.out.println(str.replace("Class", "java"));
	}

	// 6.str���� "string"�� "��Ʈ��"���� �ٲ㼭 ���
	// java.lang.String.replace();
	private void replaceTest2() {
		System.out.println(str.replace("string", "��Ʈ��"));
	}

	// 7. str�� char[] ���·� ���
	// java.lang.String.toCharArray();
	private char[] toCharArrayTest() {
		char[] res = str.toCharArray();
		return res;
	}

	// 8. str�� �� �� ������ ������ �� ���
	// java.lang.String.trim();
	private String trimTest() {
		String res = str.trim();
		return res;
	}

	// test1 : character�� ã�Ƽ� �빮�ڷ� ��ȯ�� �� ��ü ���
	// java.lang.String.substring();
	public void test1() {

		// �����ڵ�
		String target = "charater";
		int start = str.indexOf("character"); // "character"�� ���� ã��
		int end = "character".length() + start; // "character" �� �� ã��
		String upper = str.substring(start, end).toUpperCase();
		System.out.println(str.replace(target, upper));

		// ���� �ڵ�
		// System.out.println(str.replace(str.substring(32, 41),
		// str.substring(32,41).toUpperCase()));

	}

	// test2 : ��ü �������� ����ϱ�.
	public void test2() {

		// �����ڵ�
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		// �ٸ� ��� Ǯ�� (���� ���� ��)
		// for(int i = str.length() - 1; i >= 0; i--) {
		// System.out.println(str.charAt(i));
		// }

	}

}
