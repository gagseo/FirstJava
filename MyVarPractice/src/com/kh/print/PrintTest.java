package com.kh.print;

public class PrintTest {
	public static void main(String[] args) {
		System.out.print("�ȳ��ϼ���");
		System.out.println("�ڹ� �����Դϴ�");
//		ln�� �ٹٲ��̴�.
		System.out.print("print �Լ� �Դϴ�");
//------------------------------------------------------------------		
//		System.out.printf�� ������ �ڿ� ','�� �� ����ؾ��Ѵ�.
//		�׸����� ������ �������ִ� ���̴�.
		System.out.printf("\n%-5d\n", 1);
//		%d ������ ����
//		��µǴ� ���Ŀ� 5�� ���ָ� ���������� 5ĭ��ŭ �ڿ� �����ϰ�
//		-5��� ���� �������� 5ĭ��ŭ �����Ѵ�
		
		System.out.printf("%.2f\n", 1.1);
//		%f ������ �Ǽ�
//		ù°�ڸ� ������ ������ �Ϸ���.1
//		��°�ڸ� ���� ������ �Ϸ��� .2
//		
		
		System.out.printf("%c\n", 'A');
//		%c ������ ����
		
		System.out.printf("%s\n", "Hello Java");
//		%s ������ ���ڿ�
//		\n�� �ٹٲ�
		
		System.out.printf("%b", true);
//		%b ������ ����
		
		
	}
}
