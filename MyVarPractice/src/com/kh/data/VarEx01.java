package com.kh.data;

public class VarEx01 {
	public static void main(String[] args) {

	
	byte bNum = 100;
	System.out.println("정수 : "+ bNum);
	
	long lNum = 999900000000l;
	System.out.println("정수(long) : "+ lNum);
	
	float fNum = 486.520f;
	System.out.println("실수(float) : "+ fNum);
	
	double dNum = 567.890123;
	System.out.println("실수(double) : " + dNum);
	
	char a = 'A';
	System.out.println("문자(char) : " + a);
	
	String str = "Hello world";
	System.out.println("문자열(String) : " + str);
	
	boolean bool = true;
	System.out.println("논리값(boolean) : " + bool);
	
//	자동형변환 되는 경우와 강제형변환 되는 경우를 알아야한다.
//	자동형변환의 예
//	1.자료형이 다른 값에 대입될 때
	byte b = 100;
	int i = b;
	System.out.println(i); // int i = (int)b;라고 써야하는데 (int)를 생략해도 되는것이 자동 형변환이다.
//	2. 자료형이 다른 값이 계산될 때
	int c = 3;
	double b1 = 5.7;
	System.out.println(c+b1); //자동으로 c가 double로 형변환
//	(c+b1)을 (double)c+b1라고 써야하는데 자동으로 변환
	
//	강제형변환 해야하는 경우
	int num = 2147483647;
	int result = num+1;
	System.out.println(result); //-2147483647
	
	long result_=(long)num + 1;
	System.out.println(result_); //2147483648
	
	
	}
}
