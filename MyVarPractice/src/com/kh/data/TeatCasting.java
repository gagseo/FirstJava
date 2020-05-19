package com.kh.data;

public class TeatCasting {
	public static void main(String[] args) {

		// 큰데이터를 작은데이터로 강제형변환하는법
		long longVal = 100L;
		int intVal = (int) longVal;
		System.out.println(intVal);

		double dValue = 123.5;
		int iValue = (int) dValue;
		System.out.println("dValue : " + dValue + ", iValue : " + iValue);
		// 큰데이터를 작은데이터로 강제형변환할때 데이터손실이 일어날 수 있다.
//		강제 형변환 주의점
//		형변환 예제 >
//		double temp;
//		int age = (int)temp;
	}
}
