package com.kh.data;

public class DataPrint {

	public static void main(String[] args) {

		// 논리형
		boolean bool = true;
		boolean bool2 = false;

		// 문자형
		char ch = 'A';

		// 정수형
		int num = 128;
		byte bNum = 127;
		short sNum = 128;
		long lNum = 0l;
		// 자료형마다 최대로 저장할수있는 값이 다르다.

		// 실수형
		float fNum = 1.1f;
		double dNum = 1.1;

		// 참조형
		String str = "Hello Java";

		System.out.println(str);
		// 참조형은 데이터의 주소를 저장한다.
	}

}
