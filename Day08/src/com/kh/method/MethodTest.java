package com.kh.method;

public class MethodTest {

	public void methodTest() {

		AccessModifier amf = new AccessModifier();

		// AccessModifier Ŭ������ publicMethod ȣ���غ���.
		// amf.publicMethod();
		// AccessModifier Ŭ������ protectedMethod ȣ���غ���.
		// amf.protectedMethod();
		// AccessModifier Ŭ������ defaultMethod ȣ���غ���.
		// amf.defaultMethod();
		// AccessModifier Ŭ������ privateMethod ȣ���غ���.
		// amf.privateMethod();

		// -----------------------------------------------
		// return Ŭ������ sub�޼��带 ȣ���� ���� �Ű������� ���ϴ� ���� �ְ�
		// �޼��尡 �����ִ� ���� �˸��� ������ ��� ����� ����غ���.
		Return rt = new Return();
		int i = 10;
		int j = 20;
		int res = rt.sub(i, j);

		System.out.println(res);
		//���� ������� �Ʒ���¹��� ����
		System.out.println(rt.sub(10, 20));

		// return Ŭ������ div�޼��带 ȣ���� ���� �Ű������� ���ϴ� ���� �ְ�
		// �޼��尡 �����ִ� ���� �˸��� ������ ��� ����� ����غ���.
		Return rt1 = new Return();
		int i1 = 10;
		int j1 = 20;
		double res1 = rt1.div(i1, j1);
		
		System.out.println(res1);
		//���� ������� �Ʒ���¹��� ����
		System.out.println(rt1.div(i1, j1));
		
		// return Ŭ������ capital�޼��带 ȣ���� ���� �Ű������� ���ϴ� ���� �ְ�
		// �޼��尡 �����ִ� ���� �˸��� ������ ��� ����� ����غ���.
		Return rt2 = new Return();
		char ch = 'A';
		char res2 = rt2.capital(ch);
		
		System.out.println(res2);
		//���� ������� �Ʒ���¹��� ����
		System.out.println(rt2.capital(ch));
		
		//--------------------------------------------
		
		
		//static �޼��� �����غ���
		Static.staticMethod();
		Return.staticMethod();

	}

	public void staticTest() {

		System.out.println("����Ʈ�� �ּҰ��� " + Byte.MIN_VALUE + "�Դϴ�.");
		//String name = "��ȣ��";
		//������ �������� Stack�������� ������ 4byte�� �ν�
		//String ������ ũ�Ⱑ ������ �𸣱� ������ heap�� ����
		
		//static �� ���� �޸����鿡�� �̵��� ���� ������, �ӵ� ���鿡�� �̵��̴�.
		//static�� ������ �ǹ�
		
		Static.name = "��ȣ��";
		System.out.println("���� �̸��� " + Static.name + "�Դϴ�.");
	}

	public void staticTest1() {

		System.out.println("short�� �ּҰ��� " + Short.MIN_VALUE + "�Դϴ�.");
		System.out.println("���� �̸��� " + Static.name + "�Դϴ�.");
	}

	public void staticTest2() {

		System.out.println("int�� �ּҰ��� " + Integer.MIN_VALUE + "�Դϴ�.");
		System.out.println("���� �̸��� " + Static.name + "�Դϴ�.");
	}

}
