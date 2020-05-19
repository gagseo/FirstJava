package com.kh.method;

public class AccessModifier {

	// 접근제한자 [예약어] 반환형 메서드명(매개변수)

	// 메서드 접근 제한자.
	// public ( + ) : 모든 패키지에서 접근가능
	public void publicMethod() {
		System.out.println("public method");
	}

	// protected ( # ) : 상속관계일 경우에 산속된 곳에서 호출 가능
	// 상속관계가 아닐 경우 같은 패키지 내에서 접급 가능
	protected void protectedMethod() {
		System.out.println("protected method");
	}

	// default ( ~ ) : 같은 패키지 내에서만 접근이 가능
	 void defaultMethod() {
		System.out.println("default method");
	}

	// private ( - ) : 현재 클래스 내에서만 접근이 가능
	private void privateMethod() {
		System.out.println("private method");
		
			
		}
	}


