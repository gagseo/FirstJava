package com.kh.loopingstatement;

public class B2_DoWhile {

	public void doWhile() {

		// do{} ���� �ڵ带 �� �� ���� ���Ŀ�
		// ������ ���ؼ� �ݺ����θ� �����Ѵ�.
		int i = 1;
		while (i >= 2 && i < 10) {
			System.out.println("while���Դϴ�.: " + i);
			i++;

		}

		i = 1;

		do {
			System.out.println("while���Դϴ�.: " + i);
			i++;

		} while (i >= 2 && i < 10);

	}
	
	
}
