package com.kh.method;

public class Return {

	// 접근제한자 [예약어] 변환형메서명(메개변수)
	public int sub(int i, int j) {
		int res = 0;
		res = i - j;
		return res;

	}

	public double div(int i, int j) {

		double res = 0.0;
		res = i / j;
		return res;

	}

	public char capital(char ch) {

		if (ch >= 'A' && ch <= 'Z') {
			ch += 32;
		} else if (ch >= 'a' && ch <= 'z') {
			ch -= 32;
		}
		return ch;
	}
	
	//접급제한자[예약어] 반환형 메서드명(매개변수)
	
	//메서드 반환형테스트
	public static void staticMethod() {
		System.out.println("Return 클래스의 static메서드 입니다.");
		
	}

}
