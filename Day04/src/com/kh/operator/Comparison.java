package com.kh.operator;

public class Comparison {

//	�񱳿�����
//	�� ���� ���ϴ� ������.
//	������ �����ϸ� true, �ƴϸ� false�� ��ȯ�Ѵ�.
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		boolean result;
		boolean result2;
		boolean result3;
//		boolean result4;
		
		result = (a == b);
		result2 = (a <= b);
		result3 = (a > b);
//		result4 = (b % 2 == 0);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
//		System.out.println("result4 : " + result4);
		
//		b�� ¦������ Ȧ�� ���� ����ϱ�
//		"b�� ¦���ΰ�? : " true/false
		
	System.out.println("b�� ¦���ΰ�? : " +(b%2==0) );
	}
}
