package com.kh.data;

public class VarEx01 {
	public static void main(String[] args) {

	
	byte bNum = 100;
	System.out.println("���� : "+ bNum);
	
	long lNum = 999900000000l;
	System.out.println("����(long) : "+ lNum);
	
	float fNum = 486.520f;
	System.out.println("�Ǽ�(float) : "+ fNum);
	
	double dNum = 567.890123;
	System.out.println("�Ǽ�(double) : " + dNum);
	
	char a = 'A';
	System.out.println("����(char) : " + a);
	
	String str = "Hello world";
	System.out.println("���ڿ�(String) : " + str);
	
	boolean bool = true;
	System.out.println("����(boolean) : " + bool);
	
//	�ڵ�����ȯ �Ǵ� ���� ��������ȯ �Ǵ� ��츦 �˾ƾ��Ѵ�.
//	�ڵ�����ȯ�� ��
//	1.�ڷ����� �ٸ� ���� ���Ե� ��
	byte b = 100;
	int i = b;
	System.out.println(i); // int i = (int)b;��� ����ϴµ� (int)�� �����ص� �Ǵ°��� �ڵ� ����ȯ�̴�.
//	2. �ڷ����� �ٸ� ���� ���� ��
	int c = 3;
	double b1 = 5.7;
	System.out.println(c+b1); //�ڵ����� c�� double�� ����ȯ
//	(c+b1)�� (double)c+b1��� ����ϴµ� �ڵ����� ��ȯ
	
//	��������ȯ �ؾ��ϴ� ���
	int num = 2147483647;
	int result = num+1;
	System.out.println(result); //-2147483647
	
	long result_=(long)num + 1;
	System.out.println(result_); //2147483648
	
	
	}
}
