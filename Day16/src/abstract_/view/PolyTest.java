package abstract_.view;

import abstract_.model.vo.parents.Child1;
import abstract_.model.vo.parents.Child2;
import abstract_.model.vo.parents.Parent;

public class PolyTest {

	public void polyTest() {

		Parent p2 = new Child1();
		// System.out.println(p2.parentInfo());
		// System.out.println(((Child1) p2).firstChildInfo());
		System.out.println();

		Child1 c1 = new Child1();
		Child1 c11 = new Child1(1, 3, 4);
		// System.out.println(c1.firstChildInfo());
		// System.out.println(c11.firstChildInfo());

		Child2 c2 = new Child2();
		Child2 c22 = new Child2(5, 7, 9);
		// System.out.println(c2.secondChildInfo());
		// System.out.println(c22.secondChildInfo());

		int[][] iArr = new int[4][1];
		iArr[0][0] = 1;
		iArr[1][0] = 1;

		Object iArr2 = iArr; // ����

		Parent[] pArr = new Parent[4];
		pArr[0] = c1;
		pArr[1] = c11;
		pArr[2] = c2;
		pArr[3] = c22;

		for (int i = 0; i < pArr.length; i++) {
			// �������̵��� ���� info�� �ϰ������� �����´�.

			System.out.println(pArr[i].info());
			// �������̵� ���ָ� ���ǹ��� �ʿ��������.
			// if (pArr[i] instanceof Child1) { // instanceof �� �ڿ� �޼�Ʈ�� �ִ� �ν��Ͻ��� Ȯ��
			// System.out.println(((Child1) pArr[i]).firstChildInfo());
			// } else {
			// System.out.println(((Child2) pArr[i]).secondChildInfo());
			// }
		}

		// // Parent p0, �θ�Ÿ�� ������ �θ� Ŭ���� �ν��Ͻ�ȭ
		// Parent p0 = new Parent(); // ����
		//
		// // ���� �ڵ尡 ������ �� p0�� �ڽ� Ÿ������ �ٿ� ĳ����
		// // Child1 pp = (Child1) p0; // ����� �����߻�
		//
		// // �ٿ�ĳ���� : ���� ������ Ÿ���� �ļ�Ÿ���� Ÿ������ ����
		// // �ٿ�ĳ���� ex) Child1 p0 = (Child1)p0;
		// // ��ĳ���� ex) Parent ppp = pp; //��ĳ������ ��������
		//
		// // Parent c0, �θ�Ÿ�� ������ �ڽ� Ŭ���� �ν��Ͻ�ȭ
		// Parent c0 = new Child1(); // ����
		//
		// // ���� �ڵ尡 ������ �� c0�� �ڽ� Ÿ������ �ٿ�ĳ����
		// Child1 cc = (Child1) c0; // ����
		//
		// // Child p1, �ڽ�Ÿ�� ������ �θ�Ŭ���� �ν��Ͻ�ȭ
		// // Child1 c1 = new Parent(); // �Ұ���
		//
		// // ���� �ڵ尡 ������ �� p1�� �θ�Ÿ�� ������ ���ɽ���
		// // X
		// // ���ɽ��� : ���� ������ Ÿ���� ���� Ÿ������ ����
		//
		// // Child c1, �ڽ�Ÿ�� ������ �ڽ�Ŭ���� �ν��Ͻ�ȭ
		// Child1 c2 = new Child1(); // ����
		//
		// // ���� �ڵ尡 ������ �� c1�� �θ�Ÿ�� ������ ���ɽ���
		// Parent cc2 = c2;
	}

}
