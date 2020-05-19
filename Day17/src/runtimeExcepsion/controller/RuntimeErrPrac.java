package runtimeExcepsion.controller;

import java.util.Scanner;

public class RuntimeErrPrac {

	Scanner sc = new Scanner(System.in);

	public void classNArray() {

		try {
			// ClassCastException
			Object obj = new int[10];
			// String str = (String) obj;

			// ArrayIndexOutOfBoundsException
			int[] arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
			// arr[2] = 3;

			// NullPointerException
			// String str2 = null;
			// int length = str2.length();

			// } catch (ClassCastException cc) {
			// System.out.println("ClassCastException");
			// } catch (ArrayIndexOutOfBoundsException ae) {
			// System.out.println("ArrayIndexOutOfBoundsException");
			// } catch (NullPointerException ne) {
			// System.out.println("NullPointerException");

		} catch (Exception cc) { // ��� ���ܻ�Ȳ ó��

			cc.printStackTrace();

		} finally {
			System.out.println("������ �� �ɱ�?");
		}

		System.out.println("���⵵ ������ �ߵɱ�?");
	}

	// 1~100������ ������ �ϳ� �߻���Ű����.
	// ����ڷ� ���� �ϳ��� ���� �Է� ��������.
	// �߻���Ų ������ ����ڷκ��� �Է¹��� ���� ��������.
	// ����ڰ� �Է��� ���� 0�� ��� "0�� �ƴ� ���� �Է��Ͻÿ�" ������� ����ϼ���.
	// try-catch-finally ���� ����ϼ���.
	// �ݵ�� ���α׷��� ����˴ϴ�. ��� �ȳ����� �ۼ����ּ���
	// (finally Ű���� ���)
	public void artitEx() {

		int uNum = (int) (Math.random() * 100) + 1;
		System.out.println("�ϳ��� ���� �Է��ϼ���.");
		int num = sc.nextInt();
		int nNum = uNum / num;

		try {
			System.out.println("�߻��� ������ : " + uNum);
			System.out.println("���� ���� : " + nNum);

		} catch (ArithmeticException ae) {

			System.out.println("0�� �ƴ� ���� �Է��Ͻÿ�.");
			System.out.println(ae);

		} finally {
			System.out.println("�ݵ�� ���α׷��� ����˴ϴ�.");

		}

	}
}
