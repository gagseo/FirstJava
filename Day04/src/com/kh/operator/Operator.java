package com.kh.operator;

public class Operator {

	public void singleOp() {

		int y = 32;
		 y = y-- +y + ++y;
		
		System.out.println(y); // 95
		// 자바에서 전위/후외 연산자는
		// 연산이 실행 된 후가 아니라 해당 변수를 다시 호출하는
		// 시점에 션상이 실행 된다.
		}

	}
