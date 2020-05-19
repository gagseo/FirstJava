package com.kh.stringConcatration;

import java.util.Scanner;

public class StringConcatration {

	String str = "KH Academy";

	public void stringConcat() {

		// ==
		// ���ϼ���
		// ���� �ּҸ� �ٶ󺸰� �ִ����� ���� true/false ��ȯ
		String test1 = "ABC";
		String test2 = "ABC"; // test1 �� test2�� ���� �ּҸ� �ٶ󺸰��ִ�.
		System.out.println(System.identityHashCode(test1));
		System.out.println(System.identityHashCode(test2));
		System.out.println("��Ʈ�����Ǯ�� �ִ� String��ü�� �Ѵ� �ٶ󺸰� �ִ�." + (test1 == test2));

		String test3 = new String("ABC"); // heap������ �ٷ� "ABC"�� ����� ������.
		System.out.println(System.identityHashCode(test3));
		System.out.println("heap������ �ö� String�� ���Ǯ�� �ִ� String��: " + (test1 == test3));

		Scanner sc = new Scanner(System.in);
		System.out.println("ABC�� �Է��ϼ���:");
		String test4 = sc.nextLine();
		System.out.println(System.identityHashCode(test4));
		System.out.println(test1 == test4);

		// equals �޼���(String�� equals ����ض�)
		// �����
		// �ȿ� ����ִ� ���� �������� Ȯ���ؼ� true/false�� ��ȯ.
		// �ּҴ� ����� ����.
		// java.lang.String.equals�޼��带 Ȱ���ؼ�
		// test1�� test3�� ���ϴ� �ڵ带 �ۼ��ϼ���.

		System.out.println("equals �޼��� : " + test1.equals(test3));

		// Integer.parseInt(String arg)
		// Short.parseShort(String arg)

	}

	// String
	// ���ڿ� ���� ������ �� ���� immutable �̴�.
	// ���ڿ� ���� �����ϴ� �۾��� �������� �ʴ�.
	// ���ڿ��� �����ϸ� ���ο� �ּҰ��� ��ȯ���ش�.
	public void stringConcatMethod() {
		str = str.concat(" Java Class");
		System.out.println(str);
		// ��� : KH Academy Java Class
		// str + "" �� ǥ���ȴ�.

	}

	// stringBuilder �� Ư¡
	// 1.���ڰ��� ������ �� �ִ�.(mutable �ϴ�)
	// 2.�⺻ 16���� ũ���� buffer�� ����Ѵ�. ũ�⸦ ������ �� �ִ�.
	// -> ���������� ũ�Ⱑ 16�� char[]�� �����س��´�.
	// �����嵿��ȭ�� �������� �ʴ´�.
	public void stringBuilderConcat() {

		String A = "A";
		System.out.println("���� �� : " + System.identityHashCode(A));
		A += "B";
		System.out.println("���� �� : " + System.identityHashCode(A));

		StringBuilder sb = new StringBuilder();
		System.out.println("���� �� : " + System.identityHashCode(sb));
		sb.append(str).append(" �ڹ� Ŭ����"); // mutable �ϴ�(�ּҰ��� �ٲ��� �������� Ȯ���� �� �ִ�.)
		System.out.println("���� �� : " + System.identityHashCode(sb));
		System.out.println(sb);
	}

	// stringBuffer �� Ư¡
	// 1.���ڰ��� ������ �� �ִ�.(mutable �ϴ�)
	// 2.�⺻ 16���� ũ���� buffer�� ����Ѵ�. ũ�⸦ ������ �� �ִ�.
	// -> ���������� ũ�Ⱑ 16�� char[]�� �����س��´�.
	// ������ ����ȭ�� �����Ѵ�. //
	public void stringBufferConcat() {

		StringBuffer sb = new StringBuffer();
		System.out.println("���� �� : " + System.identityHashCode(sb));
		sb.append(str).append(" Java Class");// mutable �ϴ�(�ּҰ��� �ٲ��� �������� Ȯ���� �� �ִ�.)
		System.out.println("���� �� : " + System.identityHashCode(sb));
		System.out.println(sb);

	}

}
