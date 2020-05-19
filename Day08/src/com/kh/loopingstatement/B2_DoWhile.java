package com.kh.loopingstatement;

public class B2_DoWhile {

	public void doWhile() {

		// do{} 안의 코드를 한 번 실행 한후에
		// 조건을 비교해서 반복여부를 결정한다.
		int i = 1;
		while (i >= 2 && i < 10) {
			System.out.println("while문입니다.: " + i);
			i++;

		}

		i = 1;

		do {
			System.out.println("while문입니다.: " + i);
			i++;

		} while (i >= 2 && i < 10);

	}
	
	
}
